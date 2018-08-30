package com.nt.dispatcher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Dispatcher {
	
	public void dispatch(HttpServletRequest req,HttpServletResponse res,String viewName){
		String page=null;
		RequestDispatcher rd=null;
		if(viewName.equals("display_profile")){
			page="display_profile.jsp";
		}
		else{
			page="error_page.jsp";
		}
		
		try{
		//dispatch to view page
		rd=req.getRequestDispatcher(page);
		rd.forward(req,res);
		}
		catch(ServletException se){
			se.printStackTrace();
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
	}

}
