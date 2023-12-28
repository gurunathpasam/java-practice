package com.kn.palindromestring;

public class Palindrome {

	public void isPalindromeString(String inputstring) {
		String rev="";
		char[] crr=inputstring.toCharArray();
		StringBuffer r=new StringBuffer();
		for(int i =crr.length-1;i>=0;i--) {
			rev= rev+inputstring.charAt(i);
		}
		
		String s2=rev.toString();
		if(inputstring.equals(s2)) {
			System.out.println("Given number is palindrome......");
		}
		else {
			System.out.println("Given number is not a palindrome......");
		}
		
		
		
	}

}
