package com.nit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/des")
public class ServletDemo1 implements Servlet {

	@Override
	public void destroy() {

	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html");// setting the content type
		PrintWriter pw = res.getWriter();// get the stream to write the data

		String name = req.getParameter("uname");
		String mailid = req.getParameter("mid");
		String phoneno = req.getParameter("phno");
		pw.println("<html><body>");
		pw.println("Welcome to servlet");
		pw.println("Your name is:" + name+"<br>");
		pw.println("Your mailid is:" + mailid+"<br>");
		pw.println("Your phno is:" + phoneno+"<br>");

		pw.println("</body></html>");

		pw.close();
	}

}
