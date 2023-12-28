package com.kn.printingWordsOfStringByBackTraverse;

public class StringWordsBackTrackDemo {

	public static void main(String[] args) {
			//String declaration and initialization
	             String s1="I am learning strings in Java";
	             //Splitting the string based on the space
	             String[] s2=s1.split(" ");
	             //traversing the string array in reverse
	             for(int i=s2.length-1;i>=0;i--)
	             {
	            	 System.out.print(s2[i]);
	            	 System.out.print(" ");
	             }
	             
		}

	}