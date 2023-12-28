import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int r,sum= 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the  number =");
		int num =scan.nextInt();
	
		while (num>0) {
			r =num%10;
			sum=sum+r;
			num=num/10;
			scan.close();
		}
		System.out.println("the sum of digits  ="+sum);
	}
}