package methods;
import java.util.Scanner;

public class CubeNumber {

	public static void main(String[] args) {
			Scanner scan= new Scanner(System.in);
			System.out.println("enter a number =");
			int num=scan.nextInt();
			int cube = cubeNumber(num);
			System.out.println("cube number of " + num + " -->" + cube);
			scan.close();
		}
		static int cubeNumber(int num)
		{
			return num*num*num;
			
		}

	}