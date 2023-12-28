import java.util.Scanner;

public class Factors_of_number {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number = ");
		int num =scan.nextInt();
		scan.close();
		
		for(int i=1;i<=num;i++) {
			
			if(num%i==0) {
				System.out.println("factors of "+num+ "are:"+i);
			
		}
	}
	}

}
