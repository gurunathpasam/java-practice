package com.kn.jdbcConnection;

import java.sql.*;
import java.util.Scanner;


public class Employee {
	private static final String URL="jdbc:mysql://localhost:3306/sreerama";
	private static final String User_Name="root";
	private static final String Password="Guru@9014";

	private static final String UPDATE="update employee set empSalary=empSalary+(EmpSalary*0.10) where empId= ?";

	public static void main(String[] args) {
		Connection con= null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection(URL, User_Name, Password);
			PreparedStatement prst= con.prepareStatement(UPDATE);
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the id = ");
			int empId =scan.nextInt();
			
			prst.setInt(1, empId);
			
			prst.executeUpdate();
			System.out.println("Rows Are affected ");
			String query = " select * from employee";
			ResultSet rs=prst.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				if(con != null) {
					con.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}



