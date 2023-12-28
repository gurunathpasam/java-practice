package com.kn.customExceptionf;

public class InsufficientBalance extends Exception {
	public InsufficientBalance() {
		super();
		
	}
	public InsufficientBalance(String s) {
		super(s);
	}

}
