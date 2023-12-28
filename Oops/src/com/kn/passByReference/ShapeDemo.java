package com.kn.passByReference;

public class ShapeDemo {

	public static void main(String[] args) {
		
		Recatangle r= new Recatangle();
		Square s= new Square();
		Circle c= new Circle();
		
		Geometry g =new Geometry();
		g.doActivity(r);
		g.doActivity(s); 
		g.doActivity(c);
		
		
		


		
		
		

	}

}
