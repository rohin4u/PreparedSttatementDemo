package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.
					getConnection("jdbc:mysql://localhost:3306/jdbcdemo?useSSL=false&serverTimezone=UTC","root","password");
		
//		String query = "insert into customer values(?,?,?,?)";
//		
//		PreparedStatement pst = con.prepareStatement(query);
//		
//		pst.setInt(1, 101);
//		pst.setString(2, "Prakash");
//		pst.setString(3, "Khatima");
//		pst.setDouble(4, 34000.89);
//		
//		int update = pst.executeUpdate();
//		System.out.println("Updated query : "+update);

//		
		String query1 = "delete from customer where customerId=?";
		
		PreparedStatement statement = con.prepareStatement(query1);
		
		statement.setInt(1, 102);
		
		int update1 = statement.executeUpdate();
		
		
		System.out.println("Deleted User Number : "+update1);
		
		con.close();
	
	}
	

}
