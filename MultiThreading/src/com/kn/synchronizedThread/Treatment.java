package com.kn.synchronizedThread;

public class Treatment implements Runnable{
	
	@Override
	public 
	synchronized void run() {
		try {
			System.out.println("Treatment started - " +Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("Treatment in-progress - " +Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("Treatment completed- " +Thread.currentThread().getName());
			Thread.sleep(2000);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
