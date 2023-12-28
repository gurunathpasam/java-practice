package com.kn.interface4;

public class Meal implements MainCourse, Desert{
	@Override
	public void biryani() {
		System.out.println("mushroom biryani");
		
	}
	public void rasamalai() {
		System.out.println("Rasamalai- 20 pieces");
		
	}

}
