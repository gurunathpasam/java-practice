package com.kn.arrays;
import java.util.Scanner;
public class BinarySearchForPositionOFElementOfAscendingOrderArray {
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
		scan.close();

		System.out.println("enter the Element =");
		int element=scan.nextInt();
		int position=-1;
		boolean isElementFound = false;
		int low=0,high=arr.length-1,mid=0;
//		Array Traversing 
		while(low<=high) {
			mid=(low+high)/2;
			if(element==arr[mid]) {
				isElementFound=true;
				position=mid+1;
				break;
			}
			else if(element>arr[mid]) {
//				high=high;
				low=mid+1;
			}
			else {
//				low=low;
				high=mid-1;
			}
			
		}
		if(isElementFound==false) {
			System.out.println("----->element"+element+" is not found <------");
		}else {
			System.out.println("given element"+element+"position is "+position);
		}

	}

}
