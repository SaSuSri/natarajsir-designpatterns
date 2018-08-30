package com.nt.afp;

public class DBDAOFactory {
	
	public static DAO  getInstance(String type){
		
		if(type.equalsIgnoreCase("student")){
			return new DBStudentDAO();
		}
		else{
			return new DBCourseDAO();
		}
		
	}

}
