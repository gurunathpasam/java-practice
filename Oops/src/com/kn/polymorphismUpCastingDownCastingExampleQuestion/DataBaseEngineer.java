package com.kn.polymorphismUpCastingDownCastingExampleQuestion;

public class DataBaseEngineer extends SoftwareEngineer{
	
	@Override
	public void attendMeeting() {
		System.out.println("You Have to attend the database engineer meeting ");
	}

	//Child Specific class
	public void doDataBaseProject() {
		System.out.println("Do the DataBase Project ");
	}
	
	//Another child specific class
	public void learnSql() {
		System.out.println("learn the SQl ");
	}
	

}
