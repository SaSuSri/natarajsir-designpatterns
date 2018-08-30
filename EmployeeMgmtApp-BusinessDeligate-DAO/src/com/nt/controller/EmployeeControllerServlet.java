package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.businessDeligate.EmployeeRegistrationDelegate;
import com.nt.errors.EmployeeRegistrationException;
import com.nt.errors.InternalProblemException;
import com.nt.vo.EmployeeVO;

public class EmployeeControllerServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		    String no=null,name=null,addrs=null,salary=null;
		    EmployeeVO empVO=null;
		    EmployeeRegistrationDelegate deligate=null;
		    RequestDispatcher rd=null;
		    String resultMsg=null;
		   //read form data
		    no=req.getParameter("teno");
		    name=req.getParameter("tename");
		    addrs=req.getParameter("teadd");
		    salary=req.getParameter("tesal");
		    //prepare VO class obj having form data
		    empVO=new EmployeeVO();
		    empVO.setEmpNo(no);
		    empVO.setEmpName(name);
		    empVO.setEmpAddrs(addrs);
		    empVO.setEmpSalary(salary);
		    //create BusinessDeligate class obj
		    deligate= new EmployeeRegistrationDelegate();
		    try{
		    	deligate.registerEmployee(empVO);
		    	  //keep the success results in request scope
			    req.setAttribute("resMsg",empVO.getEmpNo()+"Registration successfull");
			    //forward the request
			    rd=req.getRequestDispatcher("/registration_success.jsp");
			    rd.forward(req,res);
		    }
		    catch(EmployeeRegistrationException ere){
		    	rd=req.getRequestDispatcher("/registration_err.jsp");
		    	req.setAttribute("errMsg",ere.getMessage());
		    	rd.forward(req,res);
		    	return;
		    }
		    catch(InternalProblemException ipe){
		    	rd=req.getRequestDispatcher("/registration_err.jsp");
		    	req.setAttribute("errMsg","BackEnd Problem");
		    	rd.forward(req,res);
		    	return;
		    }
		    catch(Exception e){
		      	rd=req.getRequestDispatcher("/registration_err.jsp");
		    	req.setAttribute("errMsg","Unknown Problem");
		    	rd.forward(req,res);
		    	return;
		    }
		    
		  
  	}//doGet(-,-)
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}//doPost(-,-)
}//class
