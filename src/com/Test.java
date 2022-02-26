package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.
					getConnection("jdbc:mysql://localhost:3306/jdbcdemo?useSSL=false&serverTimezone=UTC","root","password");
		
		
		String query = "select * from customer";
		
		PreparedStatement statement = con.prepareStatement(query);
		
		ResultSet rSet = statement.executeQuery();
		
		if(rSet.next()) {
			System.out.println(rSet.getInt(1));
			System.out.println(rSet.getString(2));
			System.out.println(rSet.getString(3));
			System.out.println(rSet.getInt(4));
		}
		
		con.close();
		
		

	}

}
