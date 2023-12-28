package StringVariousMethods;

public class VariousMethodsString {

	public static void main(String[] args) {
		String s1= "Gurunath";
		System.out.println("1.UpperCase");
		System.out.println(s1.toUpperCase());
		System.out.println("***********");
		System.out.println("2.LowerCase");
		System.out.println(s1.toLowerCase());
		System.out.println("***********");
		System.out.println("3.Character at given index");
		System.out.println(s1.charAt(2));
		System.out.println("***********");
		System.out.println("4.index of given character first time");
		System.out.println(s1.indexOf('a'));
		System.out.println("***********");
		System.out.println("5.index of given character last time");
		System.out.println(s1.lastIndexOf('h'));
		System.out.println("***********");
		System.out.println("6.Part of a given String");
		System.out.println(s1.substring(4));
		System.out.println("***********");
		System.out.println("7.Part of a given String from and fill give index");
		System.out.println(s1.substring(2,6));
		System.out.println("***********");
		System.out.println("8.Part of a given String is present or not");
		System.out.println(s1.contains("Guru"));
		System.out.println("***********");
	}

}