package com;

import java.sql.*;

public class JdbcClass {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3305/jsp_chandigarh","root","mysql");   
	    Statement st=conn.createStatement();
	    ResultSet rs=st.executeQuery("select empname from emp where empid = 1");
	    while(rs.next())
	    {
	    	System.out.println(rs.getString(1));
	    	//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
	    }
	    conn.close();
	}
	
}
