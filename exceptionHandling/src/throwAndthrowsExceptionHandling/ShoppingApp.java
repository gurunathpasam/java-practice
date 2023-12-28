package throwAndthrowsExceptionHandling;

import java.util.Scanner;

public class ShoppingApp {

	public static void main(String[] args) {
		System.out.println("Welcome to ShoppingApp");
		shop();
		System.out.println("*********Main() method ended*********8");
	}

	public static void shop() {
		System.out.println("----------> shop() method start ");
		try{pay();
		}catch(Exception e) {
			System.out.println("shopping is failed due to inappropriate input !");
		}
		System.out.println("**** shop() method end ***");
	}

	public  static void pay()  throws IncompatibleClassChangeError{ 
		//throws ===> sow warning to the method caller 
		System.out.println("--------> pay() method start ");
		Scanner scan=null;
		System.out.println("Enter the amount to be paid = ");
		try { 
			scan=new Scanner(System.in);
			double amount=scan.nextDouble();
			System.out.println("Amount paid = "+ amount);
		}catch(IncompatibleClassChangeError ime){
			System.out.println("Exception Handled");
		throw ime; //re-throwing exception 
		
			
		}
		scan.close();
		System.out.println("************pay() method ended*************");
		
	}

}
