import java.util.Scanner;

public class Sum_Of_Natural_Numbers {

	public static void main(String[] args) {
		int a=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number : ");
		int num =scan.nextInt();
		scan.close();
		for(int i=1;i<=num;i++) {
			a=a+i;
		}
		System.out.println(a);
				

	}

}
