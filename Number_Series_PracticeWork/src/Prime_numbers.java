import java.util.Scanner;

public class Prime_numbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number = ");
		int num =scan.nextInt();
		int count=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime");
		}
		else {
			System.out.println("not a prime ");
		}
		scan.close();

	}

}
