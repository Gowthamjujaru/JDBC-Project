package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Customer {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ clint","root","root");//schema
			PreparedStatement preparedSatatement = connection.prepareStatement("insert into custmor values(?,?,?,?,?)");//table name
			preparedSatatement.setInt(1,135);
			preparedSatatement.setString(2, "rashmi");
			preparedSatatement.setInt(3, 24);
			preparedSatatement.setString(4, "female");
			preparedSatatement.setInt(5, 1234567);
			preparedSatatement.execute();  
		    connection.close(); 
		    System.out.println("saved data");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
