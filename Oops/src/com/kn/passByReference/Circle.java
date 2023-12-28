package com.kn.passByReference;

public class Circle extends Shape{
	
	@Override
	public void draw() {
		System.out.println("Drawing Circle Shape ");
		
	}
	public double calculateArea() {
		double r=2.5;
		
		return Math.PI *r*r;
	}
	


}
