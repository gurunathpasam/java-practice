package com.kn.multithreading5;

public class Reels extends Thread{
	public void run() {
		try {
			System.out.println("reels Started ");
			Thread.sleep(2000);
			System.out.println("reels watching ");
			Thread.sleep(2000);
			System.out.println("reels ended");
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		
		}
	}

}
