package com.kn.arrays;

import java.util.Scanner;

public class FindPositionOfElementInArray2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of the array =");
		//declaration creation
		int[] arr=new int[scan.nextInt()];
	//		initialization
		for(int i=0;i<arr.length;i++) {
		System.out.print("enter the value of "+(i+1)+"=");
		arr[i]=scan.nextInt();
	
	}
		System.out.println("enter the Element =");
		int element=scan.nextInt();
		int position =positionOfElement(arr,element);
		if(position==-1) {
			System.out.println("the element "+element+"is not found ");
		}
		else {
			System.out.println("position of the element is "+position);
			}
		}
	public static int positionOfElement(int[] arr,int element) {
		boolean isFound=false;
		int position=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				isFound=true;
				position=++i;
				break;
				}
			}
		if(isFound==true) {
			return position; 
		}
		return -1;
}
}
