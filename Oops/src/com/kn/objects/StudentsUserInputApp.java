package com.kn.objects;

import java.util.Scanner;

public class StudentsUserInputApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Size of The Objects =");
		int n=scan.nextInt();
		Student[] srr=new Student[n];
		
		for(int i=0;i<srr.length;i++) {
			System.out.println("enter the ID for student " +(i+1)+"=");
			int id=scan.nextInt();
			System.out.println("enter the name for student"+(i+1)+"=");
			String name =scan.next(); 
			System.out.println("enter the Marks for student " +(i+1)+"=");
			int marks=scan.nextInt();
			Student s=new Student(id,name,marks);
			srr[i]=s;
		}
		scan.close();
		//Print the Array Elements
		for(Student s : srr) {
			System.out.println("ID="+s.id+", name="+s.name+",marks="+s.marks);
		}
		System.out.println("********************************");
//		Need to Print particular name
		for(Student s : srr) {
			if(s.name.equals("guru"))
			System.out.println("ID="+s.id+", name="+s.name+",marks="+s.marks);
		}
		System.out.println("********************************");

//		Need to print how many grace marks need to reach Passmarks(35) 
		for(Student s : srr) {
			if(s.marks<=35)
				System.out.println("Before adding the Grace Marks"+s.marks);
			int n1=35-s.marks;
			System.out.println("need to add Grace Marks "+n1);
			System.out.println("After  adding the Grace Marks "+(s.marks+n1));
			System.out.println("***********************************");

		}
		
		

	}

}
