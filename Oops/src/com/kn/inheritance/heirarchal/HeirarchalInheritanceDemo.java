package com.kn.inheritance.heirarchal;

public class HeirarchalInheritanceDemo {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.name="Sumanth";
		e1.salary=100000;
		System.out.println("Employee");
		System.out.println("Name = " + e1.name + "-salary = " +e1.salary);
		
		Developer d1=new Developer();
		d1.name="Suhail";
		d1.salary=200000;
		System.out.println("Developer");
		System.out.println("Name = " + d1.name + "-salary = " +d1.salary);
		d1.employee();
		
		TestEngineer t1=new TestEngineer();
		t1.name="guru";
		t1.salary=100000;
		System.out.println("TestEngineer");
		System.out.println("Name = " + t1.name + "-salary = " +t1.salary);
		t1.employee();
		
		Manager m1=new Manager();
		m1.name="Ganesh";
		m1.salary=1000000;
		System.out.println("Manager");
		System.out.println("Name = " + m1.name + "-salary = " +m1.salary);
		m1.employee();
		
		TeamLead l1=new TeamLead();
		l1.name="Govardhan";
		l1.salary=500000;
		System.out.println("TeamLead");
		System.out.println("Name = " + l1.name + "-salary = " +l1.salary);
		l1.employee();
		
		
		

	}

}
