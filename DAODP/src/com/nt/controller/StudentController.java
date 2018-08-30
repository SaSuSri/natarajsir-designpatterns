package com.nt.controller;

import java.sql.SQLException;
import java.util.logging.Logger;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dao.StudentDAOFactory;

public class StudentController {
	private static Logger logger=Logger.getLogger("d:/NtDP92/DAODP/DB_Exp_Log.txt");
	public String register(int sno,String sname,String sadd)throws SQLException{
		StudentBO bo=null;
		StudentDAO dao=null;
		int count=0;
		//prepare BO
		bo=new StudentBO();
		bo.setSno(sno); bo.setSname(sname); bo.setSadd(sadd);
		//use dAO
		dao=StudentDAOFactory.getInstance("jdbc");
		try{
		count=dao.insert(bo);
		}
		catch(SQLException se){
			logger.throwing("StudentController","register",se);
			throw se;
		}
		//generate result
		if(count==0)
			return "Registration failed";
		else
			return "Registration Succeded with no:"+bo.getSno();
	}//method
}//class
