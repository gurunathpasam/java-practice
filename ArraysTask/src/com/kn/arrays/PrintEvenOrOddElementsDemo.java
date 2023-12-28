package com.kn.arrays;

public class PrintEvenOrOddElementsDemo {
	public void printEvenOrOddElements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i] + "is Even number ");
			} else {
				System.out.println(arr[i] + "is Odd number ");
			}
		}
	}
	public void printEvenAndOddCount(int[] arr) {
		int evenCount=0,oddCount=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("total number of even numbers ="+evenCount);
		System.out.println("total number of even numbers ="+oddCount);

		}
	}
