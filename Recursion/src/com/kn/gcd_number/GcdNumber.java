package com.kn.gcd_number;

public class GcdNumber {

	public int gcd(int a, int b) {
		if(a%b==0) {
			return b;
		}
		else {
			return gcd(b,a%b);
		}
		
	}

}
