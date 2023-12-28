package control_constructs;

import java.util.Scanner;

public class Switch_vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter an alphabet =");
		char c = scan.next().charAt(0);
		switch(c)
		{
		case 'a':
		case 'A':
			System.out.println("it is vowel");
			break;
		case 'e':
		case 'E':
			System.out.println("it is vowel");
			break;
		case 'i':
		case 'I':
			System.out.println("it is vowel");
			break;
		case 'o':
		case 'O':
			System.out.println("it is voweL");
			break;
		case 'u':
		case 'U':
			System.out.println("it is vowel");
			break;
		
		default:
			System.out.println("consonant");
		}
		System.out.println("---> the end <---");
		scan.close();
		}
	
	



	}

