import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("enter a number : ");
		int a = scan.nextInt();
		if (a%2==0)
			System.out.println("given number is even ");
		else
			System.out.println("given number is odd");
		scan.close();

	}

}
