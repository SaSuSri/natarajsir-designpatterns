package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.nt.bo.HREmployeeBO;
import com.nt.commons.Log4jConfigurations;
import com.nt.factory.DBConnectionFactory;

public class HREmployeeDAOImpl implements HREmployeeDAO {
 private static final String  HR_INSERT_QUERY="INSERT INTO HREMP(EMPNO,ENAME,EADD) VALUES(?,?,?)";
 
 private static Logger logger=Logger.getLogger(HREmployeeDAOImpl.class);
	static{
		Log4jConfigurations.configurations();
	}//static block
	@Override
	public void insertEmployee(HREmployeeBO hrBO,Connection con) throws SQLException {
		PreparedStatement ps=null;
		//write jdbc code to insert record
	 try{
		 logger.debug("Inserting Employee into HREMP DB table");
		 //create PReparedStatemet obj
		 ps=con.prepareStatement(HR_INSERT_QUERY);
		//set query param values
		 ps.setInt(1, hrBO.getEmpNo());
		 ps.setString(2,hrBO.getEmpName());
		 ps.setString(3,hrBO.getEmpAddrs());
		 //execute Query
		 ps.executeUpdate();
	 }//try
	 catch(SQLException se){
		 logger.error("DBProblem in inserting HREMP Record",se);
		 throw se;
	 }
	 catch(Exception e){
		 logger.fatal("Un known Problem in inserting HREMP Record",e);
		 throw e;
	 }
	 finally{
		 try{
			 if(ps!=null)
				 ps.close();
		 }
		 catch(SQLException se){
			 logger.error("DB Problem in Closing PreparedStatement object",se);
			 throw se;
		 }
	 }

	}

}
