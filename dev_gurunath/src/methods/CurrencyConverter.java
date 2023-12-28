package methods;

import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("enter the money in INR : ");
		double r =scan.nextDouble();
		System.out.println("in dollars :" + dollarconverter(r));
		System.out.println("in pounds :" + poundconverter(r));
	scan.close();
		

	}
	static double dollarconverter(double r)
	{
		return r*0.0121;
	}
	static double poundconverter(double r)
	{
		return r*0.0095;
	}

}
