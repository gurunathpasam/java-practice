package control_constructs;

import java.util.Scanner;

public class if_else_ladder3 {

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		char c = scan.next().charAt(0);
		scan.close();
		if(c=='a' || c=='A') 
			System.out.println("it is vowel");
		else if (c=='e' || c=='E')
			System.out.println("it is vowel");
		else if (c=='i' || c=='I')
			System.out.println("it is vowel");
		else if (c=='o' || c=='O')
			System.out.println("it is vowel");
		else if (c=='u' || c=='U')
			System.out.println("it is vowel");
		else
		System.out.println("it is consonant");
	}

}
