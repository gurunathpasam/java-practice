import java.util.Scanner;

public class CountDigits_Integer {

	public static void main(String[] args) {
		int r,count= 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the  number =");
		int num =scan.nextInt();
	 scan.close();
		while (num>0) {
			r=num%10;
			count++;
			num=num/10;
			scan.close();
		}
		System.out.println("number of digits in the integer number ="+count);
	}
}