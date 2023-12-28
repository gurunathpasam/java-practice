package com.kn.arrays;

public class InsertionSorting {
	public int[] sorting(int[] arr) {
		int temp=0;
		for(int i=1;i<arr.length;i++) {
			temp=arr[i];
			int j=i-1;
			
			while(j>=0 && temp<arr[j]) {
					arr[j+1] =arr[j];
					j--;
				}
			arr[j+1]=temp;
			}
			
			return arr;

	}

}
