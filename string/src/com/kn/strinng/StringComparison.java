package com.kn.strinng;

public class StringComparison {

	public static void main(String[] args) {
		String s1="Ram";
		String s2="Ram";
		//reference comparison
		if(s1==s2) {
			System.out.println("reference are same");
		}
		else {
			System.out.println("reference are diffenet");
		}
		// string comparison
		if (s1.equals(s2))  {
			System.out.println("string are equal");
		}
		else {
			System.out.println("strings are un equal");
		}
	}
}
