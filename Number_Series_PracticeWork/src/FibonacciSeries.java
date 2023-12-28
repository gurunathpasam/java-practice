import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number :");
		int num =scan.nextInt();
		int a =0,b=1,c=0;
		System.out.print( a +" ");
		System.out.print( b +" ");
		for(int i=3;i<=num;i++) {
			c=a+b;
			System.out.print( c+" " );
			a=b;
			b=c;
			scan.close();
		
		}
		


	}

}
