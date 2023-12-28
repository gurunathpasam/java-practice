package com.kn.inheritance.single;

public class InhertanceDemo {

	public static void main(String[] args) {
		
		ChefRobo c1=new ChefRobo();
		DriverRobo c2=new DriverRobo();
		TeacherRobo c3=new TeacherRobo();
		c1.name="chitti";
		c1.type="1.o version";
		System.out.println("name = "+ c1.name);
		System.out.println("type = "+ c1.type);
		c1.walk();
		c1.talk();
		c1.charge();
		c1.cook();
	
		c2.name="guru";
		c2.type="2.o version";
		System.out.println("name = "+ c2.name);
		System.out.println("type = "+ c2.type);
		c2.walk();
		c2.talk();
		c2.charge();
		c2.driver();
		c3.name="suhail";
		c3.type="3.o version";
		System.out.println("name = "+ c3.name);
		System.out.println("type = "+ c3.type);
		c3.walk();
		c3.talk();
		c3.charge();
		c3.teach();
		
		
		
		
				

	}

}
