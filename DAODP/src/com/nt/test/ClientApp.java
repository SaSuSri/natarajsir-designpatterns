package com.nt.test;

import java.sql.SQLException;

import com.nt.controller.StudentController;

public class ClientApp {
	
	public static void main(String[] args) {
		StudentController controller=null;
		// get Controller
		controller=new StudentController();
		try{
			System.out.println(controller.register(10122,"raja","hyd"));
		}
		catch(SQLException se){
			System.out.println("DB problem");
		}
	}//main
}//class
