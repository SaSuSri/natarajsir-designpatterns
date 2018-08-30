package com.nt.factory;

import com.nt.dao.FinanceEmployeeDAOImpl;
import com.nt.dao.HREmployeeDAOImpl;

public class EmployeeMgmtDAOFactory {
	
	public  static  Object  createDAO(String type){
		  
		   if(type.equals("HR"))
			   return new HREmployeeDAOImpl();
		   else if(type.equals("FINANCE"))
			   return new FinanceEmployeeDAOImpl();
		   else
			   throw new IllegalArgumentException("InValid option");
	}

}
