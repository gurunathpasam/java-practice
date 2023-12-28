package com.kn.constructor;

public class EngineeringStudent extends Student{

	String branch="CSE";
	int sem=1;				
	
	public EngineeringStudent(String name, int age, String branch, int sem) {
		super(name,age);
		this.branch=branch;
		this.sem=sem;
		
		System.out.println("Child Branch = " + this.branch);
		System.out.println("Child Sem = " + this.sem);
		
		
	}
	public EngineeringStudent(String name, int age,int sem) {
		super(name,age);
		this.sem=sem;
		System.out.println("Child Sem = " + this.sem);

	}
	public EngineeringStudent(String name, int age, String branch) {
		super(name,age);
		this.branch=branch;
		System.out.println("Child Branch = " + this.branch);

	}
	
	public EngineeringStudent(String name, int age ) {
		super(name,age);
		System.out.println("Child Name = " + this.name);
		System.out.println("Child Age = " + this.age);
		
	
	}

}


