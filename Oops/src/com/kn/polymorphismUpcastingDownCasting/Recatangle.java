package com.kn.polymorphismUpcastingDownCasting;

public class Recatangle extends Shape{

	public void draw() {
		System.out.println("Drawing  Rectanagle  Shape ");
		
	}
	double l=5.5, b= 10.5;
	@Override
	public double calculateArea() {
		
		return l*b;
	}
	
	//if you have write another method in child class 
		
	public double calculatePerimeterOfReactangle() {
			return (l+b)*2;
		}



}
