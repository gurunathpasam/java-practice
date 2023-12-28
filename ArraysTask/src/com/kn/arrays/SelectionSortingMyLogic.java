package com.kn.arrays;

import java.util.Scanner;

public class SelectionSortingMyLogic {

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
		System.out.println("Before  the Selection Sorted :");
		System.out.print("[");
		for(int i: arr) {
			System.out.print(i+ " ");
		}
		System.out.println("]");
		System.out.println();
		for(int i=0;i<arr.length-1;i++) {
			for(int j=(i+1);j<arr.length;j++) {
				if(arr[i]>arr[j]) {
//					Swapping
					int temp=0;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			
		}
		System.out.println("After the  Selection Sorted :");
		System.out.print("[");
		for(int i: arr) {
			System.out.print(i+ " ");
			
		}
		System.out.println("]");
		


	}

}
