package com.servlets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import java.io.*;

public class MyServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		out.print("Hi");
//		ServletContext ctx = getServletContext();
//		String name=ctx.getInitParameter("name");

		ServletConfig config = getServletConfig();
		String name = config.getInitParameter("name");
		out.println(name);
	}
}
