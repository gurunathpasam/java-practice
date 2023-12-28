package methods;

import java.util.Scanner;

public class StringJoiner {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter your first  name=");
		 String firstname= scan.nextLine();
		 
			System.out.println("enter your middle  name=");
		 String middlename=scan.nextLine();
		 
			System.out.println("enter your last  name=");
		 String secondname= scan.nextLine();
		 
		 String s=joinstring(firstname,middlename,secondname);
		 System.out.println(s);
		 scan.close();
		 
	}

	 static String joinstring(String firstname, String middlename, String secondname) 
	 {
		 return firstname + " "+ middlename + " " +secondname;
		 
		
		
	}

}
