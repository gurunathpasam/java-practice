package com.kn.multithreading_runnable;

public class PrintCharacters implements Runnable {
	public void run() {
		for(int i=65;i<=77;i++) {
			System.out.println((char)(i));;
			try {
			Thread.sleep(400);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		
	}

}
