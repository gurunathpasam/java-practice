import java.util.Scanner;

public class NarcissisticNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number = ");
		int num=scan.nextInt();
		scan.close();
		int r,temp=num,count=0,a=1,b=0,c;
		while(num>0) {
			r=num%10;
			count++;
			num=num/10;
			}
		
		num=temp;
		c=count;
		
		while(num>0) {
			r=num%10;
			while(count>0) {
			a=a*r;
			count--;
		}
		b=b+a;
		a=1;
		num=num/10;	
		count=c;
		}
		
	
	if(temp==b) 
		System.out.println("Narcissistic number");
		else
			System.out.println("not a Narcissistic number");

	}

}
