package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.nt.bo.FinanceEmployeeBO;
import com.nt.commons.Log4jConfigurations;

public class FinanceEmployeeDAOImpl implements FinanceEmployeeDAO {
 private static final String  FINANCE_INSERT_QUERY="INSERT INTO FINANCEEMP(EMPNO,ENAME,EADD,SALARY) VALUES(?,?,?,?)";
 
 private static Logger logger=Logger.getLogger(FinanceEmployeeDAOImpl.class);
	static{
		   Log4jConfigurations.configurations();
		}//static block
	@Override
	public void insertEmployee(FinanceEmployeeBO financeBO,Connection con) throws SQLException {
		PreparedStatement ps=null;
		//write jdbc code to insert record
	 try{
		 logger.debug("Inserting Employee into Finance EMP DB table");
		 //create PReparedStatemet obj
		 ps=con.prepareStatement(FINANCE_INSERT_QUERY);
		//set query param values
		 ps.setInt(1, financeBO.getEmpNo());
		 ps.setString(2,financeBO.getEmpName());
		 ps.setString(3,financeBO.getEmpAddrs());
		 ps.setFloat(4,financeBO.getEmpSalary());
		 //execute Query
		 ps.executeUpdate();
	 }//try
	 catch(SQLException se){
		 logger.error("DBProblem in inserting FINANCEEMP Record",se);
		 throw se;
	 }
	 catch(Exception e){
		 logger.fatal("Unknown Problem in inserting FINANCEEMP Record",e);
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
