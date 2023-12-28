package com.kn.exception.Overriding;


public class Child extends Parent{
	 
	@Override
	public void m1() {
		System.out.println("Child method ");
	}
	@Override
	public void m2 ()
	{
		System.out.println("Child method2");
	}
	@Override
	
	//rule2: parent class method doesnt throws any exception, then child class throws a 
	//unchecked exception its valid 
	public void m3() throws NullPointerException{
		System.out.println("Child method3 ");

	}
//	rule2: parent class method doesnt throws any exception, then child class throws a 
//	checked exception its invalid 
//	public void m4() throws IOException{
//		System.out.println("Child method3 ");
//		
//	}
}
