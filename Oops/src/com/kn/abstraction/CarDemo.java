package com.kn.abstraction;

public class CarDemo {

	public static void main(String[] args) {
		ElectricCar ec= new ElectricCar();
		DieselCar dc=new DieselCar() {
			@Override
			public void refuel() {
				System.out.println("Diesel Car has been fueled with diesel");
				
			}
			
		};
		PetrolCar pe= new PetrolCar();
		
		ec.start();
		ec.stop();
		ec.refuel();
		System.out.println("******************************");
		
		dc.start();
		dc.stop();
		dc.refuel();
		System.out.println("************************");
		
		pe.start();
		pe.stop();
		pe.refuel();
		
		
			
		

		
	} 

}
