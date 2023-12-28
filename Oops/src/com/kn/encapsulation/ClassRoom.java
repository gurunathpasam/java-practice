package com.kn.encapsulation;

public class ClassRoom {
	private int Temperature;
	
	//Getter
	public int getTemperature() {
		return this.Temperature;
	}
//Setter
	public void setTemperature(int temperature) {
		if(temperature>=16 && temperature<=25) {
			this.Temperature = temperature;
		}
		else {
			System.out.println("Invalid Temperature. it must be in range of 16 to 25");
		}
		
	}

}
