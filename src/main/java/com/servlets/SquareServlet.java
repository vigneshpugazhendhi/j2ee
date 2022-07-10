package com.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import static java.lang.System.*;
import java.io.*;

public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
//		int k=(int)req.getAttribute("k");
//		int k=Integer.parseInt(req.getParameter("k"));
		
//		HttpSession session=req.getSession();
//		int k=(int)session.getAttribute("k");
		
		int k=0;
		Cookie[] cookies=req.getCookies();
		for(Cookie c:cookies) {
			System.out.print(c.getName());
			if(c.getName()=="k") {
				k=Integer.parseInt(c.getValue());
			}
		}
		
		k=k*k;
		PrintWriter out=res.getWriter();
		out.print("Result is:"+k);
	}
}
