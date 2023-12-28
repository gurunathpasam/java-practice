package com.kn.arrays;

import java.util.Scanner;

public class MaxMinNumberInArray {

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
		int max=-2147483648;
		int min= 2147483647;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("maximum number ="+max);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("minimum number ="+min);
		

	}

}
