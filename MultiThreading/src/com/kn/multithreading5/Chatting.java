package com.kn.multithreading5;

public class Chatting extends Thread{
	
	public void run() {
		try {
			System.out.println("Chatting Started ");
			Thread.sleep(2000);
			System.out.println("Chit Chat with friends ");
			Thread.sleep(2000);
			System.out.println("Chatting ended");
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		
		}
	}

}
