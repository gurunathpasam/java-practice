package method_overloading;

class punerichai
{
public static void main(String[] args)
	{
		makechai();
		makechai(2);
	}
	static void makechai()
	{
		System.out.println("bill for normal chai is =10");
	}
	static void makechai(int quantity)
	{
		System.out.println("bill for normal chai is="+(quantity*10));
	}
	}