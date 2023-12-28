package com.kn.inheritance.hybrid;

public class HybridInheritanceDemo {

	public static void main(String[] args) {
					
		EngineeringStudent e1= new EngineeringStudent();
		e1.name="guru";
		System.out.println("Engineering Student name= "+ e1.name);

		
		MedicalStudent m1=new MedicalStudent();
		m1.name="Suhail";
		System.out.println("Medical Student name= "+ m1.name);

		
		JavaTrainer j1=new JavaTrainer();
		j1.name="Arun";
		System.out.println("Java Trainer name= "+ j1.name);

		
		SqlTrainer t1=new SqlTrainer();
		t1.name="Ayush";
		System.out.println("SQL Trainer name= "+ t1.name);

		
		
		
		
		
		
	}

}
