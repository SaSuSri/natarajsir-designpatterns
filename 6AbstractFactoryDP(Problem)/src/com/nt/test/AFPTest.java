package com.nt.test;

import com.nt.afp.DAO;
import com.nt.afp.DBDAOFactory;
import com.nt.afp.ExcelDAOFactory;

public class AFPTest {

	public static void main(String[] args) {
		  DAO dao=null;
		  
		  dao=DBDAOFactory.getInstance("student");
		  dao.insert();
		  dao=ExcelDAOFactory.getInstance("course");
		  dao.insert();
	}//main
}//class
