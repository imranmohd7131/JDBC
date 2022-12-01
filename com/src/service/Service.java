package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Service {
	
		public void readAll()
		{
			Connection conn=null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn =DriverManager.getConnection("jdbc:mysql://localhost:3305/jsp_chandigarh","root","mysql");
				PreparedStatement pst=conn.prepareStatement("select * from emp");
				ResultSet rs=pst.executeQuery();
				while(rs.next())
				{ 
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
				}
		    }catch (Exception e1) {
				e1.printStackTrace();
			  }finally {
				  try {
					conn.close();
			    }catch (Exception e1) {
					e1.printStackTrace();
				  } 
                 }
		}	
		
		public void updateData()
		{
			Connection conn=null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn =DriverManager.getConnection("jdbc:mysql://localhost:3305/jsp_chandigarh","root","mysql");
				PreparedStatement pst2=conn.prepareStatement("update emp set name=? where empid=?");
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter employee id");
				int id=sc.nextInt();
				pst2.setInt(2, id);
				System.out.println("Enter name:");
				String name=sc.next();
				pst2.setString(1, name);
				int rows=pst2.executeUpdate();
				System.out.println(rows+"Rows updated");
			}catch (Exception e1) {
				e1.printStackTrace();
			  }finally {
				  try {
					conn.close();
			    }catch (Exception e1) {
					e1.printStackTrace();
				  } 
                 }
		}	
			
		public void deleteData()
		{
			Connection conn=null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn =DriverManager.getConnection("jdbc:mysql://localhost:3305/jsp_chandigarh","root","mysql");
				PreparedStatement pst3=conn.prepareStatement("delete from emp where empid=?");
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter employee id");
				int id2=sc.nextInt();
				pst3.setInt(1, id2);
				int rows2=pst3.executeUpdate();
				System.out.println(rows2+"Rows updated");
		}catch (Exception e1) {
			e1.printStackTrace();
		  }finally {
			  try {
				conn.close();
		    }catch (Exception e1) {
				e1.printStackTrace();
			  } 
             }
	}	
			
		public void insertData()
		{
			Connection conn=null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn =DriverManager.getConnection("jdbc:mysql://localhost:3305/jsp_chandigarh","root","mysql");
				PreparedStatement pst4=conn.prepareStatement("insert into emp values(?,?,?)");
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter employee id :");
				int id3=sc.nextInt();
				pst4.setInt(1, id3);
				System.out.println("Enter employee name :");
				String empName=sc.next();
				pst4.setString(2, empName);
				System.out.println("Enter employee salary :");
				int sal=sc.nextInt();
				pst4.setInt(3, sal);
				int rows3=pst4.executeUpdate();
				System.out.println(rows3+"Rows updated");
			}catch (Exception e1) {
				e1.printStackTrace();
			  }finally {
				  try {
					conn.close();
			    }catch (Exception e1) {
					e1.printStackTrace();
				  } 
                 }
		}	
	 }		