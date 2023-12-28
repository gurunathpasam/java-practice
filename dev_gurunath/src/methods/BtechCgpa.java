package methods;

import java.util.Scanner;

public class BtechCgpa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your CGPA : ");
		double m = scan.nextDouble();
		if (m>90)
			System.out.println("go to the masters in AI ");
		else if(m>=75 && m<90)
			System.out.println(" go for the IOT job");
		else if(m>=60 && m<75)
			System.out.println(" go for the neural network");
		else if(m>=45 && m<60)
			System.out.println(" go for the quantum computing");
		else 
			System.out.println(" go for the IT job");
		scan.close();
		
		
		

	}

}
