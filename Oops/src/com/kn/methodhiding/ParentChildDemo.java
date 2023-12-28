package com.kn.methodhiding;

public class ParentChildDemo {

	public static void main(String[] args) {
		Parent p1=new Parent();
		p1.display();
		System.out.println("***************");
		
		Child c1=new Child();
		c1.display();
		System.out.println("****************");
		
		Parent p2=new Child();
		p2.display();  //this method we are calling the child class,
		
		//output will come Parent class method, this is called Method Hiding.

	}

}
