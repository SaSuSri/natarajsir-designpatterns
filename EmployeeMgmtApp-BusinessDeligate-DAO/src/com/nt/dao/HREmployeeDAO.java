package com.nt.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.nt.bo.HREmployeeBO;

public interface HREmployeeDAO {
	
	public  void insertEmployee(HREmployeeBO  hrBO,Connection con)throws SQLException;

}
