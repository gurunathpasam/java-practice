package com.kn.largestWordInString;

public class StringLargestWordDemo {

	public static void main(String[] args) {
		//String declaration and initialization
         String s1="i wanted to be a software developer";
         //splitting the string based on the space
         String []s2=s1.split(" ");
         int len1=0,len2=0;
         int index=0;
         //traversing through the string array to find the index of string having higher length
         for(int i=0;i<s2.length;i++)
         {
        	 len2=s2[i].length();
        	 if(len2>len1)
        	 {
        		 len1=len2;
        		 index=i;
        	 }
         }
         //Printing the word in string that have higher length
         System.out.println(s2[index]);
         
	}

}