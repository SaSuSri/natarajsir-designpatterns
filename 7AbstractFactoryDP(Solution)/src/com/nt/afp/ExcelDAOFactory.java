package com.nt.afp;

public class ExcelDAOFactory implements  DAOFactory{
	
	public  DAO  getInstance(String type){
		
		if(type.equalsIgnoreCase(DAOFactoryConstants.TYPE_STUDENT)){
			return new ExcelStudentDAO();
		}
		else{
			return new ExcelCourseDAO();
		}
		
	}

}
