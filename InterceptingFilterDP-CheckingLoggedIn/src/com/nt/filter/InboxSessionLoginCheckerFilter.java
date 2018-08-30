package com.nt.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class InboxSessionLoginCheckerFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		 HttpSession ses=null;
		RequestDispatcher rd=null;
		 
	    ses=((HttpServletRequest)req).getSession(false);
	    if(ses!=null && ses.getAttribute("details")!=null){
	    	chain.doFilter(req, res);
	    }//if
	    else{
	    	req.setAttribute("errorMsg","u can not access InBox directly.. Please Login");
	    	rd=req.getRequestDispatcher("login.jsp");
	    	rd.forward(req, res);
	    }//else

	}//doFilter(-,-)
	
}//class
