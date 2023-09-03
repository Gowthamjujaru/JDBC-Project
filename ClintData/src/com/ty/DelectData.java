package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DelectData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ clint","root","root");
			PreparedStatement preparedStatement = connection.prepareStatement("update custmor set age=? where id=?");
			preparedStatement.setInt(1,32);
			preparedStatement.setInt(2, 102);
			preparedStatement.execute();
			System.out.println("update sucessfully");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
