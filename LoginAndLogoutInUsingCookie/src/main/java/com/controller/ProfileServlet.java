package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		
		req.getRequestDispatcher("link.html").include(req, resp);
		
		Cookie ck[]=req.getCookies();
		if(ck!=null) {
			String name=ck[0].getValue();
			if(!name.equals("")||name!=null) {
				pw.print("<b>Welcome to profile<b>");
				pw.print("<b>Welcome, "+name);
			}
		}else {
			pw.print("Please Login First!");
			req.getRequestDispatcher("login.html").include(req, resp);
		}
		pw.close();
	}
}
