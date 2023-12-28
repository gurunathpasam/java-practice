import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the year = ");
		int a =scan.nextInt();
		if(a%4==0 || a%100==0 && a%400==0)
			System.out.println("given year is leap year ");
		else
			System.out.println("given year is not a leap year");
		scan.close();
	}

}
