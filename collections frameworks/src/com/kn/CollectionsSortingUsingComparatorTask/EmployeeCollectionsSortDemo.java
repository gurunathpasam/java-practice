package com.kn.CollectionsSortingUsingComparatorTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

public class EmployeeCollectionsSortDemo {

	public static void main(String[] args) {
		Employee e1=new Employee(2,"Guru",50000.0);
		Employee e2=new Employee(1,"Teju",60000.0);
		Employee e3=new Employee(3,"Rubeena",40000.0);
		Employee e4=new Employee(4,"Thanishka",70000.0);


		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);

		ArrayList<Employee> l1=new ArrayList<>();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		l1.add(e4);

		System.out.println("Before Sorting ");
		System.out.println(l1);

		//1.sorting based on Id of the Employee ( Ascending )
		Collections.sort(l1, new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				if(e1.getEmpId() > e2.getEmpId()) {
					return 1;

				}else if (e1.getEmpId()< e2.getEmpId()) {
					return -1;
				}else {
					return 0;
				}

			}

		});
		System.out.println("After sorting Based on Id ");
		System.out.println(l1);
		System.out.println("********************************");

		//2.Based on name (Ascending) 
		System.out.println("After sorting based on name ");
		Collections.sort(l1, new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return e1.getEmpName().compareTo(e2.getEmpName());
			}
		});
		System.out.println(l1);
		System.out.println("********************************");


		//3.based on salary of the employee (Ascending)
		Collections.sort(l1, new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				if(e1.getSalary() > e2.getSalary()) {
					return 1;

				}else if (e1.getSalary() < e2.getSalary()) {
					return -1;
				}else {
					return 0;
				}

			}

		});
		System.out.println("After sorting Based on salary ");
		System.out.println(l1);
		System.out.println("********************************");
		System.out.println("********************************");


		//4.sorting based on Id of the Employee ( descending )
		Collections.sort(l1, new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				if(e1.getEmpId() > e2.getEmpId()) {
					return -1;

				}else if (e1.getEmpId()< e2.getEmpId()) {
					return 1;
				}else {
					return 0;
				}

			}

		});
		System.out.println("After sorting Based on Id in descending ");
		System.out.println(l1);
		System.out.println("********************************");


		//5.Based on name (descending) 
		System.out.println("After sorting based on name ");
		Collections.sort(l1, new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return e1.getEmpName().compareTo(e2.getEmpName());
			}
		});
		ListIterator<Employee> itr=l1.listIterator(l1.size());
		System.out.println("Names in descending order ");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		System.out.println("********************************");


		//6.based on salary of the employee (descending)
		Collections.sort(l1, new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				if(e1.getSalary() > e2.getSalary()) {
					return -1;

				}else if (e1.getSalary() < e2.getSalary()) {
					return 1;
				}else {
					return 0;
				}

			}

		});
		System.out.println("After sorting Based on salary  in descending");
		System.out.println(l1);




	}

}
