package calculatorapp;
import java.util.Scanner;
public class calculatorapp {

	public static void main(String[] args) {
		addition();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 2 values for subtraction = ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		subtraction(a,b);
		int m = mul();
		System.out.println("product = " + m );
		System.out.println("enter 2 values for division = ");
		int c = scan.nextInt();
		int d = scan.nextInt();
		double div = division(c,d);
		System.out.println("division= " + div);
		}
	static void addition()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 2 values for addition = ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("sum= " + (a+b));
		}
	static void subtraction(int a,int b )
	{
		System.out.println("sub = " + (a-b));
		}
	static int mul()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 2 values for product = ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		return a*b;
	}
	static double division(int a,int b)
	{
		return a/b;
	}
	
}
