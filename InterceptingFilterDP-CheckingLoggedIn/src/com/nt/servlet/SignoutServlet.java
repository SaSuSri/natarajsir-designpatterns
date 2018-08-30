package com.nt.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SignoutServlet extends HttpServlet {
	
@Override
public void doGet(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
	HttpSession ses=null;
	RequestDispatcher rd=null;
	//get Access Session
	ses=req.getSession(true);
	//invlidate the session
	ses.invalidate();
	//forward to login.jsp
	rd=req.getRequestDispatcher("/login.jsp");
	rd.forward(req,res);
}//doGet(-,-)
@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
	   doGet(req,res);
	}

}
