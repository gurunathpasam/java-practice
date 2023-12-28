package states_and_behavours;

public class Student {
	int id;
	String name;
	String branch;
	
	void eat() {
		System.out.println("keep on eating ");
		}
	void sleep() {
		System.out.println("sleep for 8 hours ");
	}
	void study() {
		System.out.println("nothing to study ");
	}
}
class StudentApp{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id = 1234;
		s1.name = "gurunath pasam";
		s1.branch = "ECE";
		s1.eat();
		s1.sleep();
		s1.study();
		System.out.println("id=" + s1.id + ",name=" + s1.name + ",branch=" + s1.branch);
	}
}



