import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a number =");
		int num=scan.nextInt();
		
		System.out.println(fizzbuzz(num));
		scan.close();
	}

	private static String fizzbuzz(int num) {
		if(num%3==0 && num%5==0) {
			return "fizzbuzz";
			}
		else if(num%3==0)
			return "fizz";
		else if(num%5==0)
			return "buzz";
		return String.valueOf(num);
	}
	

}
