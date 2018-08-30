package com.nt.test;

import com.nt.afp.DAO;
import com.nt.afp.DAOFactory;
import com.nt.afp.DAOFactoryBuilder;
import com.nt.afp.DAOFactoryConstants;

public class AFPTest {

	public static void main(String[] args) {
		  DAOFactory daoFactory=null;
		   DAO studDAO=null,courseDAO=null;
		  //get DAOFactory
		  daoFactory=DAOFactoryBuilder.build(DAOFactoryConstants.STORE_DB);
		  //get DAO objs
		  studDAO=daoFactory.getInstance(DAOFactoryConstants.TYPE_STUDENT);
		  courseDAO=daoFactory.getInstance(DAOFactoryConstants.TYPE_COURSE);
		  //use DAOs
		  studDAO.insert();
		  courseDAO.insert();
		  
	}//main
}//class
