package Iterative_looping;
//write a program for  print the table of a given number--->
import java.util.Scanner;

public class MultiplicationTables{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number :");
		int num = scan.nextInt();
		for (int i=1;i<=10; i++)
		{
			System.out.println( +num+ " * " +i+ " = " + num*i);
		}
		scan.close();
	
		

	}

}
