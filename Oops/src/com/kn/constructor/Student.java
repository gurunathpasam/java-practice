package com.kn.constructor;

public class Student {
	String name;
	int age;
	
	public Student() {
		
	}
	
	public Student(String name) {
		this.name=name;
		System.out.println("Parent Name= "+ this.name);

	}
	
	public Student(String name, int age ) {
		this.name=name;
		this.age=age;
		System.out.println("Parent name = "+ this.name);
		System.out.println("Parent age = "+ this.age);
		
		
		
	}

}
