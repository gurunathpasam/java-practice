package com.kn.number_series;

import java.util.Scanner;

public class EvenOdd {
public static void main(String[]args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter a number");
int num=scan.nextInt();
isEvenOdd(num);
}
static void isEvenOdd(int num) {
if (num%2==0)
	System.out.println("is even");
else 
	System.out.println("is odd");
}
}


