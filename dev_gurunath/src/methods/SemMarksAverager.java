package methods;

import java.util.Scanner;

public class SemMarksAverager {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter your 1st sem marks :");
		int sem1=scan.nextInt();
		System.out.print("enter your 2nd sem marks:");

		int sem2=scan.nextInt();
		System.out.print("enter your 3rd sem marks:");

		int sem3=scan.nextInt();
		System.out.print("enter your 4th sem marks:");

		int sem4=scan.nextInt();
		System.out.print("enter your 5th sem marks:");

		int sem5=scan.nextInt();
		System.out.print("enter your 6th sem marks:");

		int sem6=scan.nextInt();
		System.out.print("enter your 7th sem marks:");

		int sem7=scan.nextInt();
		System.out.print("enter your 8th sem marks:");

		int sem8=scan.nextInt();
	
		System.out.print("the average marks of 8 semester marks is " + calculateAverage(sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8));
		scan.close();
		}
	static double calculateAverage(int sem1,int sem2,int sem3,int sem4,int sem5,int sem6,int sem7,int sem8)
	{
		return (sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8;
	}
}
