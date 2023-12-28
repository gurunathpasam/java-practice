package methods;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Fahrenheit  value ");
		double f = scan.nextInt();
		
		System.out.println("In Celsius : " + temperatureconvert(f));
		scan.close();
		}
	static double temperatureconvert(double f)
	{
		return ((f - 32) * 5)/9;
	}

}