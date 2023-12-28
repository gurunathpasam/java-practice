package methods;
import java.util.Scanner;
class calculatorApp
{
	public static void main(String[] args)
	{
		addition();

		Scanner scan= new Scanner(System.in);
		System.out.println("enter 2 values for subtraction=");
		int k = scan.nextInt();
		int u = scan.nextInt();
		subtraction(k,u);

		int result = multiplication();
		System.out.println("product=" + result);

		System.out.println("enter 2 values for division=");
		int c = scan.nextInt();
		int d = scan.nextInt();
		double divi = division(c,d);
		System.out.println("division=" + divi);

		System.out.println("enter 2 values for modulus division=");
		int e = scan.nextInt();
		int f = scan.nextInt();
		double m = modulus(e,f);
		System.out.println(" modulus division=" + m);
		scan.close();
	}
	
	static void addition()
	{
	Scanner scan= new Scanner(System.in);
	System.out.println("enter 2 values for addition=");
	int a = scan.nextInt();
	int b = scan.nextInt();
	System.out.println("sum=" + (a+b));
	scan.close();
	}
	static void subtraction(int a,int b)
	{
	int sub = a-b;
	System.out.println("subtraction=" + sub);
	}
	static int multiplication()
	{
	Scanner scan= new Scanner(System.in);
	System.out.println("enter 2 values for multiplication=");
	int c = scan.nextInt();
	int d = scan.nextInt();
	
	scan.close();	

	return c*d;
	}
	static double division(int a,int b)
	{
	return a/b;
	}
	static double modulus(int a,int b)
	{
	return a%b;
	}
}
		
		







