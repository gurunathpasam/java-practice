package objects_class;
import java.util.Scanner;

public class car {
	String color;
	String model;
	double price;

	void drive()
	{
		System.out.println("its drive like bhoom bhoom ");
	}
	void honk()
	{
		System.out.println("its sounds like pawnn pawnn");
	}
	class carapp
	{
	public static void main(String[] args)
	{
		car c1=new car();
		c1.color = "yellow";
		c1.model = "brezza";
		c1.price = 1300000;
		c1.drive();
		c1.honk();
		System.out.println("color=" + c1.color + ",model=" + c1.model + ",price=" + c1.price );

	}
	}
}
