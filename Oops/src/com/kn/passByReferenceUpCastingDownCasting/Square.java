package com.kn.passByReferenceUpCastingDownCasting;

public class Square extends Shape{

	public void draw() {
		System.out.println("Drawing Square  Shape ");
		
	}
	double side=5.5;

	public double calculateArea() {
		
		return side * side;
	}
	//if you have write another method in child class 
			public double calculatePerimeterOfSquare() {
				return 4*side;
			}
	


}
