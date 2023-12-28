package com.kn.polymorphismUpcastingDownCasting;

public class ShapeDemo {

	public static void main(String[] args) {
		
		//Create the Parent Object 
		Shape sh;
		
		//create the Child Object (Reactangle) by using Parent reference 
		sh = new Recatangle();
		
		sh.draw(); //Called the Method
		System.out.println(sh.calculateArea());  //Overrided Method
		
		// we need to go for Downcasting to Child class(Reactangle);
		System.out.println("******************************************8");
				
		
		//create the Child Object (Square) by using Parent reference For Upcastng
		sh= new Square();
		sh.draw(); //Called the Method
		System.out.println(sh.calculateArea());  //Overrided Method
		
		// we need to go for Downcasting to Child class(Square);
		System.out.println("Perimeter Area = "+ ((Square)(sh)).calculatePerimeterOfSquare());
		System.out.println("***********************************8");
				
		//create the Child Object(Circle) by using Parent reference 
		sh = new Circle();
		sh.draw(); //Called the Method 
		System.out.println("Calculated Area = "+sh.calculateArea()); //Overrided Method 
		
//		System.out.println("Perimeter Area = " + sh.calculatePerimeter); //Error will come because of child specific method 
		
		// we need to go for Downcasting to Child class(Circle);
		System.out.println("Perimeter Area = "+ ((Circle)(sh)).calculatePerimeter());
		
		
		
		
		
		
		

	}

}
