package com.kn.abstraction;

abstract public class Car {
	public void start() {
		System.out.println("Car has Started ");
		
	}
	public void stop() {
		System.out.println("Car has Stopped");
	}
	public abstract void refuel();

}
