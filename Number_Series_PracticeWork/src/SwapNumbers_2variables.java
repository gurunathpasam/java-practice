import java.util.Scanner;

public class SwapNumbers_2variables {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two values =");
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		System.out.println("before swapping x=" +x+ ",y=" + y);
		
		x= x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("after swapping x=" +x+ ",y=" + y);
		scan.close();

	}

}
