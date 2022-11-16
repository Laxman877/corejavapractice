package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		req.getRequestDispatcher("link.html").include(req, resp);
		
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		
		if(password.equals("admin123")) {
			pw.print("You are successfully login!");
			pw.print("<>Welcome, "+name);
			
			Cookie ck=new Cookie("name", name);
			resp.addCookie(ck);
		}else {
			pw.print("Sorry , UserName Or password error!");
			req.getRequestDispatcher("login.html").include(req, resp);
		}
		pw.close();
	}
}
