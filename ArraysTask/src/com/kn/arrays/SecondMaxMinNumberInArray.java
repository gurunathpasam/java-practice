package com.kn.arrays;

import java.util.Scanner;

public class SecondMaxMinNumberInArray {

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
		int max1=-2147483648;
		int min1= 2147483647;
		int max2=-2147483648;
		int min2= 2147483647;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
				}
			if(arr[i]<min1) {
				min2=min1;
				min1=arr[i];
			}
		}
		System.out.println("maximum1 nuber ="+max1);
		System.out.println("minimum1 number ="+min1);
		System.out.println("maximum2 nuber ="+max2);
		System.out.println("minimum2 number ="+min2);
		}

}
