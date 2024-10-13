package com.guru.springboot.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionManagement {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		Statement st=con.createStatement();
		int res =st.executeUpdate("update guru set bal=bal-700 where accno=1");
		int fin=st.executeUpdate("update amma set bal=bal+700 where accno=2");
		if(res==1 && fin ==1)
		{
			System.out.println("balance updated");
		}
		
	    
	}

}
