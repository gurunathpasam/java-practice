package com.kn.superconstructor;

public class Parent {
	String name="motu";
	int age =36;
	
	public Parent() {
		super();
		System.out.println("====> Parent no-arg Constructor");
	}
	
	public Parent(String name, int age) {
		super();
		
		System.out.println("@@@@@@@@@@@@>Before");
		System.out.println("Parent name = "+ this.name);
		System.out.println("Parent Age = "+ this.age);
		System.out.println("Parent  2 -arg Constructor");
		
		this.name=name;
		this.age=age;
		System.out.println("@@@@@@@@@@@@@@@>After");
		System.out.println("Parent name = "+ this.name);
		System.out.println("ParentAge = "+ this.age);
		
	}
	
	

}
