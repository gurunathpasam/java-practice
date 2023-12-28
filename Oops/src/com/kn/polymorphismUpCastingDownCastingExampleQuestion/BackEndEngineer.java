package com.kn.polymorphismUpCastingDownCastingExampleQuestion;

public class BackEndEngineer extends SoftwareEngineer {
	
	@Override
	
	public void attendMeeting() {
		System.out.println("You have to attend BackEnd Software Field meeting ");
	}
	
	//Child Specific class 
	public void doBackEndProject() {
		System.out.println("You have to do the Backend project ");
	}
	
	

}
