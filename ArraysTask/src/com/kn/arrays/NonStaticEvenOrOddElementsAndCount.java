package com.kn.arrays;
//very important ......
import java.util.Scanner;

public class NonStaticEvenOrOddElementsAndCount{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		declaration creation
		System.out.println("enter the Array size =");
		int[] arr=new int[scan.nextInt()];
		
//		//		initialization
		for(int i=0 ;i<arr.length;i++) {
			System.out.print("Enter the Elements=" );
			arr[i]=scan.nextInt();
		}
		scan.close();
		PrintEvenOrOddElementsDemo e1 = new PrintEvenOrOddElementsDemo();
		e1.printEvenOrOddElements(arr);
		e1.printEvenAndOddCount(arr);
	}

}

