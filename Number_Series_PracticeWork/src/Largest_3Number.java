import java.util.Scanner;

public class Largest_3Number {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter three numbers :  ");
		int a =scan.nextInt();
		int b =scan.nextInt();
		int c =scan.nextInt();
		if(a>b && a>c)
			System.out.println("first--> is bigger ");
		else if(b>c && b>a)
			System.out.println("second----> is bigger ");
		else 
			System.out.println("third ---> is bigger ");
		scan.close();

	}

}
