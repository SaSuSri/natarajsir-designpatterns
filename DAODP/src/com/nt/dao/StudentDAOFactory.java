package com.nt.dao;

public class StudentDAOFactory {
	
	public static StudentDAO getInstance(String type){
		if(type.equals("jdbc"))
			return new StudentDAOImpl();
		else
			return null;
	}//method
}//class
