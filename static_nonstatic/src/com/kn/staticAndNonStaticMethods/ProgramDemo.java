package com.kn.staticAndNonStaticMethods;

public class ProgramDemo {

	public static void main(String[] args) {
		//Static 
		Program.display1();
		
		
		//Instence- Non static  
		Program p1=new Program();
		p1.display2();
		
		Program p2=new Program();
		p2.display2();
		
	}

}
//Static will possible one time execution only 
//in instance multiple times will be possible 
