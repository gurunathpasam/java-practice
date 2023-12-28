package com.kn.differentMethodsInInterface;

public interface Interface1 {
	//Abstract method 
	public abstract  void m1();
	
	//static method 
	public static void m2() {
		System.out.println("Static mathod ");
	}
	
	//constructor is not  Allowed in interface
//	public interface1() {
//		
//	}
	
	//default methods
	default void m3() {
		System.out.println("Default method from the interface ");
		//This method will applicable defaultly for all the implementation classes.
		 
	}
	//private method
	private void m6() {
		
	}
	

}
