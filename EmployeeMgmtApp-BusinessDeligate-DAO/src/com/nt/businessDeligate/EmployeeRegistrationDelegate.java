package com.nt.businessDeligate;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.NamingException;

import org.apache.log4j.Logger;

import com.nt.bo.FinanceEmployeeBO;
import com.nt.bo.HREmployeeBO;
import com.nt.commons.Log4jConfigurations;
import com.nt.dao.FinanceEmployeeDAO;
import com.nt.dao.HREmployeeDAO;
import com.nt.errors.EmployeeRegistrationException;
import com.nt.errors.InternalProblemException;
import com.nt.factory.DBConnectionFactory;
import com.nt.factory.EmployeeMgmtDAOFactory;
import com.nt.vo.EmployeeVO;

public class EmployeeRegistrationDelegate {
	Logger logger=Logger.getLogger(EmployeeRegistrationDelegate.class);
	static{
		Log4jConfigurations.configurations();
	}
	
	public void registerEmployee(EmployeeVO vo)throws EmployeeRegistrationException,InternalProblemException{
		HREmployeeBO hrBO=null;
		FinanceEmployeeBO financeBO=null;
		FinanceEmployeeDAO financeDAO=null;
		HREmployeeDAO hrDAO=null;
		Connection con=null;
		boolean isExceptionRaised=false;
		//convert VO to multiple BO class objects  (usecase1)
		//for HRBO
		hrBO=new HREmployeeBO();
		hrBO.setEmpNo(Integer.parseInt(vo.getEmpNo()));
		hrBO.setEmpName(vo.getEmpName());
		hrBO.setEmpAddrs(vo.getEmpAddrs());
		
		//for financeBO
		financeBO=new FinanceEmployeeBO();
		financeBO.setEmpNo(Integer.parseInt(vo.getEmpNo()));
		financeBO.setEmpName(vo.getEmpName());
		financeBO.setEmpAddrs(vo.getEmpAddrs());
		financeBO.setEmpSalary(Float.parseFloat(vo.getEmpSalary()));
		//get DAO class objs
		financeDAO=(FinanceEmployeeDAO)EmployeeMgmtDAOFactory.createDAO("FINANCE");
		hrDAO=(HREmployeeDAO)EmployeeMgmtDAOFactory.createDAO("HR");
		try{
		//get Connection (usecase3)
			con=DBConnectionFactory.getConnection("java:/comp/env/DsJndi");
			//begin Transaction (usecase3)
			con.setAutoCommit(false);  
			logger.info("Trying to get connection object from DBConenctorFactory");
		}
		catch(SQLException se){
			logger.error("Problem in getting Connection");
			isExceptionRaised=true;
			throw new InternalProblemException(); //use case2
			
		}
		catch(NamingException ne){
			logger.error("Problem in Jndi name");
			isExceptionRaised=true;
			throw new InternalProblemException(); //use case2
		}
		catch(Exception e){
			logger.fatal("UnProblem in getting connection");
			isExceptionRaised=true;
			throw new InternalProblemException(); //use case2
		}
		//use DAOs
		try{
	    	financeDAO.insertEmployee(financeBO, con);
		     hrDAO.insertEmployee(hrBO, con);
		isExceptionRaised=false;
		}
		catch(SQLException se){
			isExceptionRaised=true;
			if(se.getErrorCode()==1)
			   throw new EmployeeRegistrationException("Duplicate Employeed Id"); //usecase2
			else if(se.getErrorCode()==12899)
				throw new EmployeeRegistrationException("Lengty data for col value"); //usecase2
			else
				throw new EmployeeRegistrationException("Other registration problem");
		}
		catch(Exception e){
			logger.error("Registration problem");
			isExceptionRaised=true;
			throw new EmployeeRegistrationException(); //usecase2
		}
		finally{
			try{
				if(isExceptionRaised){
					con.rollback();  //use case3
				}
				else{
					con.commit();  //use case3
				}
			}
			catch(SQLException se){
				logger.error("Problem in Transaction magement");
				throw new EmployeeRegistrationException();
			}
		}//finally
	}//method
}//class
