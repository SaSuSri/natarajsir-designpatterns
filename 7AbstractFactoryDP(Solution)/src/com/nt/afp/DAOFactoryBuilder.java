package com.nt.afp;

public class DAOFactoryBuilder {
	
	public static DAOFactory build(String storeType){
	    if(storeType.equals(DAOFactoryConstants.STORE_DB)){
	         return new DBDAOFactory();
	    }
	       else if(storeType.equals(DAOFactoryConstants.STORE_EXCEL)){
	           return new ExcelDAOFactory();
	          }
	       else{
	    	   return null;
	       }
	}

}
