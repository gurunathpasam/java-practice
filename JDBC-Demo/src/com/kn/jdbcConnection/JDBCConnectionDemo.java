package com.kn.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCConnectionDemo { 

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/sreerama";
		String User_name="root";
		String Password="Guru@9014";
		//String CREATE_STUDENT_QUERY="CREATE TABLE STUDENT1 (ID INT, NAME VARCHAR(20), MARKS INT);";
		//String  INSERT_STUDENT_qUERY="INSERT INTO STUDENT1 VALUES(1,'GURU',86),(2,'TEJU',90);";
		//String UPDATE_STUDENT_qUERY="UPDATE STUDENT1 SET NAME='GURUNATH' WHERE NAME='GURU';";
		String DELETE_STUDENT_qUERY="DELETE FROM STUDENT1 WHERE NAME='TEJU';";
		try {
			//1.Load & register Driver 
			Class.forName("com.mysql.cj.jdbc.Driver"); //FQCN(Fully qualified Class name )
			System.out.println("=====> Driver loaded & registered successfully");

			//2.Establish the connection with DataBase
			Connection con= DriverManager.getConnection(url, User_name, Password);
			System.out.println("===> Connection Established Successfully ==> " + con);

			//String CREATE_STUDENT_QUERY="CREATE TABLE STUDENT1 (ID INT, NAME VARCHAR(20), MARKS INT);";
			//3. Create Statement Object 
			Statement st= con.createStatement();

			//4.Send & Execute Query
			//st.execute(CREATE_STUDENT_QUERY); // its All ready executed 
			//int count=st.executeUpdate(INSERT_STUDENT_qUERY); // its All ready executed 
			//int count=st.executeUpdate(UPDATE_STUDENT_qUERY); // its All ready executed 
			int count=st.executeUpdate(DELETE_STUDENT_qUERY);
			System.out.println(count+" rows Affected ");


			System.out.println("-----> Student1 Table Craeted Successfully ...!");
		}catch (SQLException e) {
			System.out.println("==> Failed to establish Connection ");
			e.printStackTrace();
		}

		catch (ClassNotFoundException e) {
			System.out.println("Driver Not Found ");
			e.printStackTrace();
		}

	}

}
