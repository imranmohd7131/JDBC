package com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*Class.forName("com.mysql.cj.jdbc.Driver");
		Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3305/jsp_chandigarh","root","mysql");
		Statement st=co.createStatement();
		int rows=st.executeUpdate("update emp set name='ddd' where empid= 2");
		System.out.println(rows+"Rows affected");
		int rowss=st.executeUpdate("insert into emp values(7,'eeee',8)");
		System.out.println(rowss+"Rows affected");
		int rowsss=st.executeUpdate("delete from emp where name='eeee'");
		System.out.println(rowss+"Rows affected");
		co.close();*/
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3305/jsp_chandigarh", "root", "mysql");
//		Statement st=conn.createStatement();
//		ResultSet rs=st.executeQuery("select * from emp");
//		while(rs.next())
//		{
//			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
//		}
//		conn.close();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3305/jsp_chandigarh", "root", "mysql");
		CallableStatement cs=conn.prepareCall("{call get_all()}");
		ResultSet rs=cs.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		conn.close();
	}
}
