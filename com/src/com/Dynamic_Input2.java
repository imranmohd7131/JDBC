package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Dynamic_Input2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3305/jsp_chandigarh", "root", "mysql");
		PreparedStatement ps=conn.prepareStatement("delete from emp where empname=?");
		Scanner sc =new Scanner (System.in);
		System.out.println("enter records:");
		String n=sc.next();
		ps.setString(1,n);
		int r=ps.executeUpdate();
		System.out.println(r+"Rows affected");
		conn.close();
		
		
	}
}
