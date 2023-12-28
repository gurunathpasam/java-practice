package com.kn.arrays;

import java.util.Scanner;

public class BubbleSortingOfArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enetr the size of the Array : ");
		int size=scan.nextInt();
		//Declaration and Creation 
		int[] arr=new int[size];
//		initialization 
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the Element"+(i+1)+"=");
			arr[i]=scan.nextInt();
		}
		System.out.println("Before  the Sorted :");
		System.out.print("[");
		for(int i: arr) {
			System.out.print(i+ " ");
		}
		System.out.println("]");
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
//					Swapping
					int temp=0;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count=1;
				}
			}
			if(count==0) {
				break;
			}
		}
		System.out.println("After the Sorted :");
		System.out.print("[");
		for(int i: arr) {
			System.out.print(i+ " ");
			
		}
		System.out.println("]");
		

	}

}
