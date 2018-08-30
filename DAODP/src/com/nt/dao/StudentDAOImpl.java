package com.nt.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private static final String INSERT_STUDENT_QUERY="INSERT INTO STUDENT VALUES(?,?,?)";
	private static Logger logger=Logger.getLogger("d:/NTDP92/DAODP/DB_Exp_Log.txt");
	static Properties props=null;
	
    static{
    	try{
       InputStream is=null;	
       is=new FileInputStream("src\\com\\nt\\commons\\jdbc.properties");
       props=new Properties();
       props.load(is);
    	}
    	catch(IOException ioe){
    		logger.throwing("StudentDAOImpl","static block", ioe);
    		System.out.println(ioe);
    	}
    	
    }//static block
	@Override
	public int insert(StudentBO bo) throws SQLException {
		 Connection con=null;
		 PreparedStatement ps=null;
		 int count=0;
		 try{
		//get Connection
		 con=ConnectionFactory.createConnection(props.getProperty("jdbc.url"), 
				                                                                         props.getProperty("jdbc.dbUser"),
				                                                                        props.getProperty("jdbc.dbPwd"));
		 
		 //write logic to insert  record
		  ps=con.prepareStatement(INSERT_STUDENT_QUERY);
		  ps.setInt(1,bo.getSno());
		  ps.setString(2,bo.getSname());
		  ps.setString(3,bo.getSadd());
		  
		  count=ps.executeUpdate();
		  logger.log(Level.INFO, "Student record is saved");
		 }
		 catch(SQLException se){
			 logger.throwing("StudentDAOImpl","insert ", se);
			 throw se;
		 }
		 finally{
			 try{
			 if(ps!=null)
				 ps.close();
			 }
			 catch(SQLException se){
				 logger.throwing("StudentDAOImpl","insert ", se);
				 throw se;
			 }
			 try{
				 if(con!=null)
					 con.close();
				 }
				 catch(SQLException se){
					 logger.throwing("StudentDAOImpl","insert ", se);
					 throw se;
				 }
		 }
		 return count;
	}//method
}//class

