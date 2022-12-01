package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Dynamic_Input {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3305/jsp_chandigarh","root","mysql");
		PreparedStatement pst=co.prepareStatement("select * from emp where empname=?");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee name :") ;
		String i=sc.next();
		pst.setString(1,i);
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{ 
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		co.close();
	}
}
	
