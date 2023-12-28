package com.kn.if_else_ladder;

import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter x value = ");
			int x=scan.nextInt();
			System.out.println("enter y value = ");
			int y=scan.nextInt();
			quadrant(x,y);
			
			scan.close();
	}

	private static void quadrant(int x,int y) {
		if(x>0 && y>0)
            System.out.println("Quadrant I");   

        else if(x<0 && y>0)
            System.out.println("Quadrant II");

        else if(x<0 && y<0) System.out.println("Quadrant III"); 

        else if (x > 0 && y < 0)
            System.out.println("Quadrant IV");
            
        else if (x == 0 && y == 0)
            System.out.println("Origin");
            
        else if (y==0 && x!=0)
            System.out.println("x-axis");
            
        else if (x==0 && y!=0)
            System.out.println("y-axis");

    }

	}


