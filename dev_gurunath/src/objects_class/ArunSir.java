package objects_class;


public class ArunSir {
	int id;
	String name;
	String subject;
	
	void teach()
	{
		System.out.println("started teaching ");
	}
	void takeattendance()
	{
		System.out.println("take attendance");
	}
	ArunSir(int id, String name, String subject) {
		
		this.id=id;
		this.name=name;
		this.subject=subject;
}
	class ArunSirApp
	{
	
	public static void main(String[] args) 
	{
		ArunSir a=new ArunSir(1234,"gurunath","java");
		
		a.teach();
		a.takeattendance();
		System.out.println("id=" +a.id + ",name=" + a.name + ",subject=" + a.subject);
		
		

	}
	}
}
