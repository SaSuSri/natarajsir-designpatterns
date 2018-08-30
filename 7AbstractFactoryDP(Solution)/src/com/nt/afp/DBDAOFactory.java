package com.nt.afp;

public class DBDAOFactory implements DAOFactory {
	
	public  DAO  getInstance(String type){
		
		if(type.equalsIgnoreCase(DAOFactoryConstants.TYPE_STUDENT)){
			return new DBStudentDAO();
		}
		else{
			return new DBCourseDAO();
		}
		
	}

}
