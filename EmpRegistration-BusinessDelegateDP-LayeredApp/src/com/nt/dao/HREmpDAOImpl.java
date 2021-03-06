package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.nt.bo.BaseEmpBO;
import com.nt.bo.HREmpBO;

public class HREmpDAOImpl implements EmpDAO {
	private static Logger logger=Logger.getLogger(HREmpDAOImpl.class);
   private static final String  HREMP_INSERT="INSERT INTO HREMP VALUES(?,?,?,?,?)";
	@Override
	public void insert(Connection con, BaseEmpBO bo, int autoEno) throws SQLException {
		logger.debug("insert(-,-,-) of method HREmpDAOImpl class");
		PreparedStatement ps=null;
		try{
			//insert the record
			ps=con.prepareStatement(HREMP_INSERT);
			//set values to query params
			ps.setInt(1,autoEno);
			ps.setString(2,bo.getEmpName());
			ps.setString(3,bo.getEmpAddrs());
			ps.setString(4,((HREmpBO) bo).getEmpDesg());
			ps.setInt(5,bo.getDeptNo());
			//execute the qyery
			ps.executeUpdate();
			logger.info("HREmp record is inserted");
		}//try
		catch(SQLException se){
			logger.error("Problem in HREmp Record  insertion");
			throw se;
		}
		catch(Exception e){
			logger.fatal("Unknow Problem in HREmp Record  insertion");
			throw e;
		}
		finally{
			//close jdbc objs
			try{
				if(ps!=null){
					ps.close();
				}
			}
			catch(SQLException se){
				logger.error("Problem in closing jdbc PreparedStatement object");
				throw se;
			}
		}//finally
	}//method
}//class
