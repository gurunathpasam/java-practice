package com.kn.polymorphismUpCastingDownCastingExampleQuestion;

public class SoftWareEngineerDemo2 {

	public static void main(String[] args) {
		BackEndEngineer be=new BackEndEngineer();
		DataBaseEngineer de=new  DataBaseEngineer();
		JavaBackEndEngineer je =new JavaBackEndEngineer();
		PythonBackEndEngineer pe =new PythonBackEndEngineer();
		doActivity(be);
		System.out.println("*****************");
		doActivity(de);
		System.out.println("*****************");
		doActivity(je);
		System.out.println("*****************");
		doActivity(pe);
	}
	public static void doActivity(SoftwareEngineer se) {
		se.attendMeeting();
		se.writeTestcase();
		if(se instanceof BackEndEngineer) {
			se.attendMeeting();
			((BackEndEngineer)(se)).doBackEndProject();
		}
		else if(se instanceof DataBaseEngineer) {
			se.attendMeeting();
			((DataBaseEngineer)(se)).doDataBaseProject();
			((DataBaseEngineer)(se)).learnSql();
		}
		else if(se instanceof JavaBackEndEngineer) {
			((JavaBackEndEngineer)(se)).doBackEndProject();
			((JavaBackEndEngineer)(se)).learnJava();
		}
		else {
			((PythonBackEndEngineer)(se)).doBackEndProject();
			((PythonBackEndEngineer)(se)).learnPython();
		}
		
		
		
	}

}
