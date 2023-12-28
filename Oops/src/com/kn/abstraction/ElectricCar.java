package com.kn.abstraction;

public class ElectricCar extends Car{
	
	@Override
	public void refuel() {
		System.out.println("Electric car has been recharged");
	}
	//if you dont have to override mark the abstarct in method and class also 
	

}
