package com.kn.arrays;
import java.util.Scanner;
//Ascending And descending 
public class BinarySearchForPositonOfElementOfAnyOrderArray {
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
		int low=0,high=arr.length-1,mid=(low+high)/2;
		boolean isElementFound=false;
		if(element==arr[mid]) {
			System.out.println("given element"+element+"position is "+(mid+1));
			isElementFound=true;
		}
		for(int i=0;i<mid-1;i++) {
			if(element==arr[i]) {
				System.out.println("given element"+element+"position is "+(i+1));
				isElementFound=true;
				}
			}
			for(int i=mid+1;i<=high;i++) {
				if(element==arr[i]) {
					System.out.println("given element"+element+"position is "+(i+1));
					isElementFound=true;
					}
				}
			if(isElementFound==false) {
				System.out.println("Element is not Found ");
				scan.close();
				}
	}

}
