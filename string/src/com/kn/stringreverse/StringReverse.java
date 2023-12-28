package com.kn.stringreverse;

public class StringReverse {

	public static void main(String[] args) {
		String s1="iam learning String in java";
		String [] srr=s1.split(" ");
		for(int i=srr.length-1;i>=0;i--) {
			System.out.print(srr[i]+" ");
		}

	}

}
