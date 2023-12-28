package methods;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("enter the  value of principle:");
		double p=scan.nextDouble();
		System.out.print("enter the value of time : ");
		double t = scan.nextDouble();
		System.out.print("enter the value of rate of interest : ");
		double r = scan.nextDouble();
		System.out.println("the interest is " + simpleinterest(p,t,r));
		scan.close();

	}
	static double simpleinterest(double p,double t,double r)
	{
		return (p*t*r)/100;
	}

}
