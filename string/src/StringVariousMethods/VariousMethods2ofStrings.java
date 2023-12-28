package StringVariousMethods;
public class VariousMethods2ofStrings {

	public static void main(String[] args) {
		String s1 = "Md Suhail Shaik";
		System.out.println("***********");
		
		System.out.println("--->Returns the length of this String");
		System.out.println(s1.length());
		System.out.println("***********");
		System.out.println("--->String starts with with prefix");
		System.out.println(s1.startsWith("Md"));
		System.out.println("***********");
		System.out.println("--->String End with with suffix");
		System.out.println(s1.endsWith("Shaik"));
		System.out.println("***********");
		System.out.println("--->Replace the particular prefix");
		System.out.println(s1.replace("Suhail","Guru" ));
		System.out.println("***********");
		System.out.println("--->Replace all the ");
		System.out.println(s1.replaceAll("Md Suhail Shaik","Pasam guru nath" ));
		System.out.println("***********");
		System.out.println("--->split the  given string ");
		String[] srr = s1.split(" ");
		for(int i=srr.length-1;i>=0;i--) {
			System.out.print(srr[i]+" ");
		}
		System.out.println("");
		
		
		System.out.println("***********");
		String s2 = "              Md Suhail Shaik          ";

		System.out.println("--->Trim the spaces before and after the name");
		System.out.println(s2);
		System.out.println(s2.trim());
		
		
	}

}