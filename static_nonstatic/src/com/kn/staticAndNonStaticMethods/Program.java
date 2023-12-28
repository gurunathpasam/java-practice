package com.kn.staticAndNonStaticMethods;

public class Program {
	//Static Var
	static int x,y;
	
	//static block
	static {
		System.out.println("static block ");
		x=10;
		y=20;
	}
	//Static Method 
	public static void display1() {
		System.out.println("Static method display1()");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
	
	//instance var
	int a,b;
	
	//instance block
	{
		System.out.println("Instance Blaock ");
		a=11;
		b=22;
		x=100;
		y=200;
	}
	
	//instence method 
	void display2() {
		System.out.println("Instance method()");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
	
	
	

}
