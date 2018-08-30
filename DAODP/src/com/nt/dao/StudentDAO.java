package com.nt.dao;

import java.sql.SQLException;

import com.nt.bo.StudentBO;

public interface StudentDAO {
	
  public int insert(StudentBO bo)throws SQLException;

}
