package com.kn.passByReferenceUpCastingDownCasting;

public class Geometry {
	public void doActivity(Shape sh) {
		//UpCasting
		sh.draw();
		System.out.println("Area = "+sh.calculateArea());
		
		//Down-Casting
		if(sh instanceof Recatangle) {
			System.out.println("Perimeter Area = "+ ((Recatangle)(sh)).calculatePerimeterOfRectangle());
		}
		else if(sh instanceof Square) {
			System.out.println("Perimeter Area = "+ ((Square)(sh)).calculatePerimeterOfSquare());
		}
		else {
			System.out.println("Perimeter Area = "+ ((Circle)(sh)).calculatePerimeter());

		}
		System.out.println("****************************");
		
	}

}
