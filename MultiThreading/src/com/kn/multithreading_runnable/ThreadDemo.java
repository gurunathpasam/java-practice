package com.kn.multithreading_runnable;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumbers pn=new PrintNumbers();
		PrintCharacters pc=new PrintCharacters();
		
//		creating Thread class object & assignment activities
		Thread t1=new Thread(pn);
		Thread t2=new Thread(pc);
		
		//starting the threads 
		t1.start();
		t2.start();
	}

}
