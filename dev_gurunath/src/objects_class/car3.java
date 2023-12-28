package objects_class;

public class car3 {
	String color;
	String model;
	double price;
	void drive()
	{
		System.out.println("its drive like bgoooooooooooooom");
	}
	void honk()
	{
		System.out.println("pawammmm pawmmmmmm");
	}
	car3(String color,String model,double price )
	{
		this.color=color;
		this.model=model;
		this.price=price;
	}
	class car3App
	{
	public static void main(String[] args) {
		car3 c1=new car3("red","i10",120000000);
		c1.drive();
		c1.honk();
		System.out.println("color=" +c1.color+ ",model=" +c1.model+ ",price=" +c1.price);
		car3 c2=new car3("yellow","guru",130000000);
		c2.drive();
		c2.honk();
		System.out.println("color=" +c2.color+ ",model=" +c2.model+ ",price=" +c2.price);
			
	}
	}
}
