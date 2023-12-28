package multipleMethodsIn_Abstraction;

public class Program2 extends Program{
	
	@Override// foer the Abstract method 
	public void m3() { 
		System.out.println("abstract method overriden in child class ");
		
	}
	//constructor
	public Program2() {
		super();
		System.out.println("child class constructor");
	}
	

}
