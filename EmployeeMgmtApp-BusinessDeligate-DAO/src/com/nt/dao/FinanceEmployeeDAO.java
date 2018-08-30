package com.nt.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.nt.bo.FinanceEmployeeBO;

public interface FinanceEmployeeDAO {
	
	public  void insertEmployee(FinanceEmployeeBO  financeBO,Connection con)throws SQLException;

}
