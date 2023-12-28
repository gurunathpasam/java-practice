import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int r,sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the  number =");
		int num =scan.nextInt();
		int temp = num;
		while (num>0) {
			r =num%10;
			sum =(sum*10)+r;
			num=num/10;
			scan.close();
		}
		if (temp==sum)
		System.out.println("given number is palindrome ");
		else
			System.out.println("given number is not a palindrome");

	}

}
