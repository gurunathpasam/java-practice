package com.kn.multithreading_runnable;

public class PrintNumbers implements Runnable{
	public void run() {
		
		for(int i=1;i<=10;i++) {
			System.out.println("numbers = " + i);
			try {
				Thread.sleep(600);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
