package com.kn.reversingWordOfString;

public class StringWordsReverseDemo {

	public static void main(String[] args) {
		//String declaration and initialization
            String s1=" I am learning strings in java";
            //Splitting the string with the consideration of space
            String []s2=s1.split(" ");
            //Object creation for  StringWordsReverse class 
            StringWordsReverse s=new StringWordsReverse();
            for(int i=0;i<s2.length;i++)
            {
            	//method calling to reverse the each word of the string
            	s.reverseStringWords(s2[i]);
            }
            
	}

}