package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InboxServlet extends HttpServlet {
	
@Override
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
   PrintWriter pw=null;
	//general settings
   pw=res.getWriter();
   res.setContentType("text/html");
   //display INBoX content
   pw.println("<h1 style='text-align:center'>InBox Page </h1>");
   pw.println("<a href='signouturl'>signout</a>");
   pw.close();	
}
@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	   doGet(req,res);
	}

}
