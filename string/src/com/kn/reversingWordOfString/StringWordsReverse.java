package com.kn.reversingWordOfString;

public class StringWordsReverse {

	public void reverseStringWords(String string) {

		char [] crr=string.toCharArray();
		for(int i=crr.length-1;i>=0;i--)
		{
			System.out.print(crr[i]);
		}
		System.out.print(" ");}

}
