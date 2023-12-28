package objects_class;

public class ObjectStudent {
	int id;
	String name;
	String branch;
	void eat()
	{
		System.out.println("keep on eating ");
	}
	void sleep()
	{
		System.out.println(" keep on sleeping ");
	}
	void study()
	{
		System.out.println(" keep on study");
	}
}
	class ObjectStudentApp
	{
	public static void main(String[] args) {
		ObjectStudent s1 = new ObjectStudent();
		s1.id=1234;
		s1.name="gurunath";
		s1.branch="ECE";
		s1.eat();
		s1.sleep();
		s1.study();
		System.out.println("id=" + s1.id + ",name=" + s1.name + ",branch=" + s1.branch );
	}

}