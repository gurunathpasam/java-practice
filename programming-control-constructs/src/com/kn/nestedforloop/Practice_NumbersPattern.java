package com.kn.nestedforloop;



public class Practice_NumbersPattern {

	public static void main(String[] args) {
		for(int i =1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				if(i>=j && (i+j)<=10) {
					System.out.print(j);
				}else {
					System.out.print(" ");
				}
					
				
			}
			System.out.println(" ");
		}
		

	}

}
