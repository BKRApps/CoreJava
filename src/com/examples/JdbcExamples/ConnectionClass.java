package com.examples.JdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionClass {

	 public void getConnection(){
		 Connection connection = null;
		 try{
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 String url = "jdbc:sqlserver://birku01-w7:1433;DatabaseName=Java";
			 connection = DriverManager.getConnection(url,"sa", "Richmond485");
			System.out.println("Connected");
			
			Statement stmt=connection.createStatement();
			ResultSet rs=stmt.executeQuery("select * from Courses");
			System.out.println("Printing the Values");
			while(rs.next()){
				System.out.println(rs.getString(1)+"\t"+rs.getString(2));
			}
		 }catch(ClassNotFoundException e){
			 e.printStackTrace();
		      System.exit(1);
		 }
		 catch(SQLException e){
			 e.printStackTrace();
		      System.exit(2);
		 }
		 
	 }
}
