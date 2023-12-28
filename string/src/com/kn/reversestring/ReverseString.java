package com.kn.reversestring;

public class ReverseString {

	public  String revserseString(String s1) {
		char [] crr=s1.toCharArray();
		StringBuffer r = new StringBuffer();
		
//		traversing 
		for(int i=crr.length-1; i>=0;i--) {
			r=r.append(crr[i]);
		}
		return r.toString();
		
	}

}
