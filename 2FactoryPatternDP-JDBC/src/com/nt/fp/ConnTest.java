package com.nt.fp;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnTest {

	public static void main(String[] args)throws Exception {
		 Connection con=null;
		//register jdbc driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Establish the connection
		con=DriverManager.getConnection("jdbc:oracle:oci8:@xe","system","manager");
		System.out.println("con object class name"+con.getClass());
	}//main
}//class
