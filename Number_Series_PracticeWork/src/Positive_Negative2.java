import java.util.Scanner;

public class Positive_Negative2 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("enter a number : ");
		int a = scan.nextInt();
		if (a>0)
			System.out.println("given number is postive ");
		else if (a<0)
			System.out.println("given number is negative ");
		else
			System.out.println("--->invalid number<---");
		scan.close();

	}

}
