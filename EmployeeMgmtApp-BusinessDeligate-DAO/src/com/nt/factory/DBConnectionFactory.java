package com.nt.factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.nt.commons.Log4jConfigurations;

public class DBConnectionFactory {
	private static Logger logger=Logger.getLogger(DBConnectionFactory.class);
	static{
		Log4jConfigurations.configurations();
	}//static block
	
	public static Connection getConnection(String jndi)throws SQLException,NamingException{
		logger.debug("DBConnectionFactory:getConnection()");
		 Connection con=null;
		 InitialContext context=null;
		 DataSource ds=null;
		 try{
		 //create InitialContext object
		 context=new InitialContext();
		 ds=(DataSource)context.lookup(jndi);
		//get Connection
		 con=ds.getConnection();
		 }
		 catch(SQLException se){
			 logger.error("DB connection problem",se);
			 throw se;
		 }
		 catch(NamingException ne){
			 logger.error("DataSoruce jndi  problem",ne);
			 throw ne;
		 }
		 catch(Exception e){
			 logger.fatal("Unknown  problem",e);
			 throw e;
		 }
		 return con;
	}//getConnection(-);
}//class
