package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nt.vo.UserDetails;

public class LoginHelperServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 PrintWriter pw=null;
		 HttpSession ses=null;
		 String user=null,pass=null;
		 UserDetails details=null;
		 RequestDispatcher rd=null;
		 
		  //general settings
		 pw=res.getWriter();
		 //get Session

		 //read form data
		 user=req.getParameter("uname");
		 pass=req.getParameter("pwd");
		 if(user.equals("raja") && pass.equals("rani")){
			 ses=req.getSession(true);
			 //prepare VO
			 details=new UserDetails();
			 details.setUname(user); details.setPwd(pass);
			 ses.setAttribute("details",details);
			 rd=req.getRequestDispatcher("inboxurl");
			 rd.forward(req,res);
		 }
		 else{
			 req.setAttribute("errorMsg","InvalidCredentails");
			 rd=req.getRequestDispatcher("login.jsp");
			 rd.forward(req,res);
		 }

	}//doGet(-,-)
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		  doGet(req,res);
	}

}
