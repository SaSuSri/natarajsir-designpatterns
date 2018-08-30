package com.nt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {
	private static Logger logger=Logger.getLogger("d:/NtDP92/DAODP/DB_Exp_Log.txt");
	public static Connection  createConnection(String url,String dbUser,String dbPwd)throws SQLException{
		 Connection con=null;
		 try{
			 logger.log(Level.INFO, "ConnectionFactory:createConnection");
		//Establish the connection
		 con=DriverManager.getConnection(url,dbUser, dbPwd);
		 }
		 catch(SQLException  se){
			 logger.throwing("ConnectionFactory","createConnection(-,-,-)", se);
			 throw se;
		 }
		 return con;
	}//method
}//class
