package com.nt.afp;

public class ExcelDAOFactory {
	
	public static DAO  getInstance(String type){
		
		if(type.equalsIgnoreCase("student")){
			return new ExcelStudentDAO();
		}
		else{
			return new ExcelCourseDAO();
		}
		
	}

}
