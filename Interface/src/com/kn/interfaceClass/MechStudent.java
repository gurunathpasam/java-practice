package com.kn.interfaceClass;

public class MechStudent implements Student{

	@Override
	public void study() {
		System.out.println("Studying AutoCad");

	}
	@Override
	public void doProject() {
		System.out.println("Working Robotics project ");

	}

}
