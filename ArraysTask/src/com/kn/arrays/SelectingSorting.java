package com.kn.arrays;

public class SelectingSorting {
	public int[] sorting(int[] arr) {
		int temp=0;
		int index=0;
		for(int i=0;i<arr.length-1;i++) {
			int min =arr[i];
			for(int j=(i+1);j<arr.length;j++) {
				if(min>arr[j]) {
					min=arr[j];
					index=j;
				}
			}
//			Swapping
			temp=min;
			arr[index]=arr[i];
			arr[i]=temp;
			
		}
		return arr;

	}

}
