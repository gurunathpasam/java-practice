package com.kn.methodoverriding;

public class PayementDemo {

	public static void main(String[] args) {
		
		Payment p= new Payment();
		p.bill();
		p.offer();
		p.pay();
		
		Upi u = new Upi();
		u.bill();
		u.offer();
		u.pay();
		
		Wallet w = new Wallet();
		w.bill();
		w.offer();
		w.pay();
		
		Card c = new Card();
		c.bill();
		c.offer();
		c.pay();
		
				

	}

}
