package objects_class;

public class car4 {
	String color;
	String model;
	double price;
	void drive()
	{
		System.out.println(" its drive like bhoom");
	}
	void honk()
	{
		System.out.println(" its sound like phawmmmm");
	}
	car4(String color,String model,double price)
	{
		this.color=color;
		this.model=model;
		this.price=price;
	} 
	class car4App
	{

	public static void main(String[] args) {
		car4 c1=new car4("yellow","i10",120000000);
		c1.drive();
		c1.honk();
		System.out.println("color is= "+ c1.color + ",model= " + c1.model + ",price =" + c1.price );
		car4 c2=new car4("red","itel",130000000);
		c2.drive();
		c2.hashCode();
		System.out.println("color is= "+ c2.color + ",model= " + c2.model + ",price =" + c2.price );

				
	}
		

	}

}
