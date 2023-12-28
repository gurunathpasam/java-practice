package methods;

import java.util.Scanner;

public class SecretMessageDecoder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter any character : ");
		char c = scan.next().charAt(0);
	
		System.out.println("The decoded message is =" + decodecharacter(c));
		scan.close();
			
	}
	static int decodecharacter(char c)
	{
		return c;
	}

}
