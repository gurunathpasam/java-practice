import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		int fact=1;
		Scanner scan=new Scanner(System.in);
		System.out.print("enter a number :");
		int num =scan.nextInt();
		for(int i=1 ;i<=num;i++) {
			fact=fact*i;
			scan.close();
		}
		System.out.println("the factorial of given number of " + num+ "="+fact);

	}

}
