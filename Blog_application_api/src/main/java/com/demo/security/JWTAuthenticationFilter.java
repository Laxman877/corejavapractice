package com.demo.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;

@Component
public class JWTAuthenticationFilter extends OncePerRequestFilter {
	@Autowired
	private UserDetailsService userDetailsService;
	@Autowired
	private JWTTokenHelper jwtTokenHelper;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		// 1. get token

		//String requestToken = request.getHeader(HttpHeaders.AUTHORIZATION);
		String requestToken = request.getHeader("Authorization");
		// Bearer 2531546khj
		System.err.println(requestToken);
		

		String username = null;

		String token = null;

		if (requestToken != null && requestToken.startsWith("Bearer ")) {
			token = requestToken.substring(7);
			try {
				username = this.jwtTokenHelper.getUserNameFromToken(token);

			} catch (IllegalArgumentException e) {
				System.err.println("Unable to get Jwt token");
			} catch (ExpiredJwtException e) {
				System.err.println("Jwt token has expire");
			} catch (MalformedJwtException e) {
				System.err.println("invalid jwt");
			}
			
			UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
			// once we get the token , now validate

			if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
				
				
				if (this.jwtTokenHelper.validateToken(token)) {

					UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
							userDetails, null,userDetails.getAuthorities());

					usernamePasswordAuthenticationToken
							.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

					SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
				} else {
					System.err.println("invalid jwt token");
				}
			} else {
				System.err.println("username is null or context is not null");
			}
			
		} else {
			System.err.println("Jwt token does not begin with Bearer");
		}
		
		//filterChain.doFilter(request, response);
		filterChain.doFilter(request, response);
	}

}
