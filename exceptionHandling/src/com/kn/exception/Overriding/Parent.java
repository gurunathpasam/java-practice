package com.kn.exception.Overriding;

import java.io.IOException;

public class Parent {
	//unchecked exception
	public void m1() throws ArithmeticException{
		System.out.println("Parent Method ");
	}
	
	//checked exception  
	public void m2()throws IOException {
		System.out.println("Parent method2 ");
	}
	public void m3() {
		System.out.println("Parent method3 ");

	}
	public void m4() {
		System.out.println("Parent method3 ");
		
	}

}
