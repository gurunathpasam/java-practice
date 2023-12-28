package com.kn.methodoverriding;

public class Payment {
	
	public void bill() {
		System.out.println("Bill Generated");
	}
	public void offer() {
		System.out.println("Promo code applied ");
	}
	public void pay() {
		System.out.println("payment mode ");
		System.out.println("****************************");
	}

}
