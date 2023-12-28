import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int r = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the  number =");
		int num =scan.nextInt();
	
		while (num>0) {
			r =num%10;
			System.out.print(r);
			num=num/10;
			scan.close();
		}
		
	}
}