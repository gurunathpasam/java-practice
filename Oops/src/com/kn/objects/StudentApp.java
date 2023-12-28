package com.kn.objects;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		
		Student s1=new Student(01,"Amit",92);
		Student s2=new Student(02,"Aakash",85);
		Student s3=new Student(03,"Ankit",99);
		
		Student[] srr=new Student[3]; 
		
		srr[0]=s1;
		srr[1]=s2;
		srr[2]=s3;
		
		System.out.println("id ="+srr[0].id+", name="+srr[0].name+", marks="+srr[0].marks);
		System.out.println("id ="+srr[1].id+", name="+srr[1].name+", marks="+srr[1].marks);
		System.out.println("id ="+srr[2].id+", name="+srr[2].name+", marks="+srr[2].marks);
		
		
//		Taking Input From The User
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter The Size of The Objects =");
//		int n=scan.nextInt();
//		
//		for(int i=3;i<n+3;i++) {
//			Student s=new Student((scan.nextInt()),(scan.next()),(scan.nextInt()));
//			srr[i]=s;
//		}
//		scan.close();
//		//Print the Array Elements
//		for(Student s : srr) {
//			System.out.println("ID="+s.id+", name="+s.name+",marks="+s.marks);
//			
//		}
		

	}

}
