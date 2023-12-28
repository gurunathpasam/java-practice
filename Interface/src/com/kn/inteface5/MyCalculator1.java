package com.kn.inteface5;

abstract public class MyCalculator1 implements Calculator1, Calculator2{
	
	@Override
	public void multiplication() {
		System.out.println("Multiplication");
		
	}
	public void division() {
		System.out.println("Division");
	}
	

}
