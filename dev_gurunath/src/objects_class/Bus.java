package objects_class;

public class Bus {
	String color;
	String model;
	double price;
	void drive()
	{
		System.out.println("its drive very speed.....>");
	}
	void honk()
	{
		System.out.println("its sound like pawmmmmm");
	}
	class BusApp
	{
		
	public static void main(String[] args) {
		Bus b1=new Bus();
		b1.color="yellow";
		b1.model="guru";
		b1.price= 1300000.00;
		b1.drive();
		b1.honk();
		System.out.println("color is= "+ b1.color + ",model= " + b1.model + ",price =" + b1.price );

		
		
		
		

	}

}
}
