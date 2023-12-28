package control_constructs;

import java.util.Scanner;

public class if_else_ladder2 {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your marks");
		int marks = scan.nextInt();
		scan.close();
		if (marks > 90)
		{
			System.out.println("A- Grade");
		}
		else if (marks >=75 && marks<= 90)
		{
			System.out.println("b- Grade");
		}
		
		else if (marks >=50 && marks<= 75)
		{
			System.out.println("C- Grade");
		}
		else if (marks >= 35 && marks<=50)
		{
			System.out.println("D- Grade");
		}
		else 
		{
			System.out.println("one more attempt");
		}

	}

}

