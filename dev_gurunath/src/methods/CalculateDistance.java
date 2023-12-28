package methods;

import java.util.Scanner;

public class CalculateDistance {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter speed : ");
		double a= scan.nextDouble();
		System.out.println("enter a time :");
		double b= scan.nextDouble();
		double distance= calculateDistance(a,b);
		System.out.println("distance is :" + distance);
		scan.close();

	}
	static double calculateDistance(double speed, double time) {
		return speed*time;
		
	}

}
