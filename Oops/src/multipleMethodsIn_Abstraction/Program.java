package multipleMethodsIn_Abstraction;

public abstract class Program {
	
	//ststic variables
	static int i;
	//instance varible
	int j;
	//ststic block
	static{ 
		System.out.println("Static block ");
		i=10;
		}
	//instance block 
	{
		System.out.println("Instance block ");
	}
	//concrete static method
	public static void m1() {
		System.out.println("concrete static method ");
	}
	//concrete instance method 
	public void m2() {
		System.out.println("concrete instance method ");
	}
	//abstract method
	public abstract void m3();
	//constructor
	public Program() {
		System.out.println("Parent constructor");
	}
	//main method 
	public static void main(String[] args) {
		System.out.println("Main() method ");
	}
	//final method 
	final public void m4() {
		System.out.println("final method from abstract class ");
	}
	
	
	
	
	

}
