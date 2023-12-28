import java.util.Scanner;

public class BuzzNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number =");
		int num =scan.nextInt();
		scan.close();
		if(num%7==0 || num%10==7)
			System.out.println("given number is Buzz number ");
		else
			System.out.println("given number is a not Buzz number ");

	}

}
