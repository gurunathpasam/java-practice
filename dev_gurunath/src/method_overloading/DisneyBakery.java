package method_overloading;

public class DisneyBakery
{
public static void main(String[] args)
	{
		makechai();
		makechai(2);
		makechai("lemmon");
		makechai("lemmon",5); 
	}
	static void makechai()
	{
		System.out.println("bill for normal chai is =10");
	}
	static void makechai(int quantity)
	{
		System.out.println("bill for normal chai is="+(quantity*10));
	}
	static void makechai(String flavour)
	{
		System.out.println("bill for" + flavour + "chai=15");
	}
	static void makechai(String flavour, int quantity)
	{
		System.out.println("bill for" + flavour+"chai="+ (quantity*15));
	}
		
} 
