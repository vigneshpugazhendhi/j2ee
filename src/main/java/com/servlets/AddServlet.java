package com.servlets;
import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;

import static java.lang.System.*;
import java.io.IOException;

public class AddServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		try {
//			res.getWriter().println(i+j);
			//RequestDispatcher or Redirect to call a servlet from another servlet
			int k=i+j;
			
			
//			req.setAttribute("k",k);
//			RequestDispatcher rd=req.getRequestDispatcher("square");
//			rd.forward(req, res);
			
			
//			res.sendRedirect("square?k="+k);
			
//			HttpSession session=req.getSession();
//			session.setAttribute("k",k);
			
			Cookie cookie=new Cookie("k",k+" ");
			res.addCookie(cookie);
			res.sendRedirect("square");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
