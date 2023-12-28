package com.kn.superconstructor;

public class Child extends Parent {
	String name="chhotu";
	int age = 12;
	public Child() {
		super();
		System.out.println("---> Child no-arg Constructor");
	}
	
	public Child(String name, int age ) {
		super(name,age);
		System.out.println("***************>Before");
		System.out.println(" Child name = "+ this.name);
		System.out.println("Child Age = "+ this.age);
		System.out.println("Child 2 -arg Constructor");
		
		this.name=name;
		this.age=age; 
		
		System.out.println("***************>After");
		System.out.println("Child name = "+ this.name);
		System.out.println("Child Age = "+ this.age);
		
		
	}


	
	
	

}
