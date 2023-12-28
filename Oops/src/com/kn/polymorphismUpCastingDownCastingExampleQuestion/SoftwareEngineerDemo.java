package com.kn.polymorphismUpCastingDownCastingExampleQuestion;

public class SoftwareEngineerDemo {

	public static void main(String[] args) {
		
		SoftwareEngineer se=new SoftwareEngineer();
		se.attendMeeting();
		se.writeTestcase();
		System.out.println("********************************");
		
		se= new BackEndEngineer();
		se.attendMeeting();
		((BackEndEngineer)(se)).doBackEndProject();
		System.out.println("*************************************");
		
		se=new DataBaseEngineer();
		se.attendMeeting();
		((DataBaseEngineer)(se)).doDataBaseProject();
		((DataBaseEngineer)(se)).learnSql();
		System.out.println("*********************************************");
		
		se=new JavaBackEndEngineer();
		((JavaBackEndEngineer)(se)).doBackEndProject();
		((JavaBackEndEngineer)(se)).learnJava();
		System.out.println("******************************************");
		
		se= new PythonBackEndEngineer();
		((PythonBackEndEngineer)(se)).doBackEndProject();
		((PythonBackEndEngineer)(se)).learnPython();
		
	}

}
  
