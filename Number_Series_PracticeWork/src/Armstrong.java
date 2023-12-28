import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int r,temp=0,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number =");
		int num=scan.nextInt();
		temp=num;
		while(num>0) {
			r=num%10;
			r=r*r*r;
			sum +=r;
			num /= 10;
			
		}if(temp==sum)
		System.out.println("given number is armstrong ");
		else
			System.out.println("given number is not a armstrong  ");
		scan.close();

	}

}
