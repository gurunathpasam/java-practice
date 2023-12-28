package demo;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("user! please enter the an integer");
		int a = scan.nextInt();
		System.out.println("user! pleease enter the another integer");
		int b = scan.nextInt();
		Calculator c = new Calculator();
		c.add(a,b);
		c.sub(a,b);
		c.mul(a,b);
		c.div(a,b);
		c.mod(a,b);
		
		
	}

}
