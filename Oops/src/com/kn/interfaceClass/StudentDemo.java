package com.kn.interfaceClass;

public class StudentDemo {

	public static void main(String[] args) {
		CSEStudent cs=new CSEStudent();
		MechStudent ms=new MechStudent();
		StudentDemo.callMethod(cs);
		callMethod(ms);
		
	}

	private static void callMethod(Student s) {
		s.study();
		s.doProject();

		 
	}

}
