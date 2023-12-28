package com.kn.polymorphismUpcastingDownCasting;

public class Circle extends Shape{
	
	@Override
	public void draw() {
		System.out.println("Drawing Circle Shape ");
		
	}
	double r=2.5;

	//Child Specific Method 
	public double calculateArea() {
		
		return Math.PI *r*r;
	}
	 
	//if you have write another method in child class 
	public double calculatePerimeter() {
		return 2* Math.PI *r;
	}


}
