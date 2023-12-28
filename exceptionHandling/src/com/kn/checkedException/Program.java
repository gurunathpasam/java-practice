package com.kn.checkedException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	public static void main(String[] args) {
		System.out.println("Program started ------");
		try {
			takeInput();
		}
		catch(IOException e) {
			System.out.println("Exception is handled in main() mathod ");
			e.printStackTrace();
		}
		System.out.println("Program ended ");
	}
	public static void takeInput() throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String input=br.readLine();
		String input2=br.readLine()	;
		System.out.println("INput = " +input);
		System.out.println("INput = " +input2);
		
	}

}
