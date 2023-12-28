package com.kn.passByReferenceUpCastingDownCasting;


public class ShapeDemo {

	public static void main(String[] args) {
		
		Geometry g =new Geometry();

		Recatangle r= new Recatangle();
		Square s= new Square();
		Circle c= new Circle();
		
		g.doActivity(r);
		g.doActivity(s); 
		g.doActivity(c);
		
		
		
		

	}

}
