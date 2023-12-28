import java.util.Scanner;

public class SwapNumbers_3variables {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two values =");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int temp=0;
		System.out.println("before swapping a=" +a+ ",b=" + b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping a=" +a+ ",b=" + b);
		scan.close();

	}

}
