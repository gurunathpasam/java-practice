package com.kn.multithreading5;

public class InstagramApp {

	public static void main(String[] args) {
		System.out.println("instagram Application");
		Chatting c=new Chatting();
		Reels r=new Reels();
		
		c.start();
		r.start();
		try {
			c.join();
			r.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}finally{
		System.out.println("Instagram App terminated ");
		}
	}

}
