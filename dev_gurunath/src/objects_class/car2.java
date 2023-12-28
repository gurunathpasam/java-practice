package objects_class;

public class car2 {
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
	 car2(String color , String model , double price)
	 {
		 this.color = color;
		 this.model = model;
		 this.price = price;
	 }
}
	 class carApp2j
	 {

	public static void main(String[] args) 
	{
		car2 c1 = new car2("Black","seltos",16000000);
		c1.drive();
		c1.honk();
		System.out.println("color=" +c1.color+ ",model=" +c1.model+ ",price=" +c1.price);
		car2 c2 = new car2("red", "i10" , 1000);
		c1.drive();
		c1.honk();
		System.out.println("color=" +c2.color+ ",model=" +c2.model+ ",price=" +c2.price);
	}
	 }

