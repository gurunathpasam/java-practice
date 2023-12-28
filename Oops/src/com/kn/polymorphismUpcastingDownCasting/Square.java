package com.kn.polymorphismUpcastingDownCasting;

public class Square extends Shape{

	public void draw() {
		System.out.println("Drawing Suare  Shape ");
		
	}
	double side=5.5;
	@Override
	public double calculateArea() {
		
		return side * side;
	}
	//if you have write another method in child class 
		public double calculatePerimeterOfSquare() {
			return 4*side;
		}


}
