package com.kn.arrays;

import java.util.Scanner;

public class FindPositionOfElementInArray {

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
		positionOfElement(arr,element);
		
	}
	public static void positionOfElement(int[] arr,int element) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				System.out.println("position of the element is "+(i+1));
				break;
				}
			else {
				if(i==(arr.length-1)) {
					System.out.println("Element is not found ");
				}
			}
			
			}
		

}
}
