
public class Reverse_guru {

	public static void main(String[] args) {
		int num=123456789,reverse=0;
		while(num>0) {
			int r=num%10;
			System.out.print(r);;
			num=num/10;
		}

	}

}
