package com.kn.if_else_ladder;

import java.util.Scanner;

public class Characters {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the character :");
		char c = scan.next().charAt(0);
		vowel(c);
		scan.close();

	}

	 static void vowel(char c) {
		if((c>='a' && c<='z') || (c>='A' && c<='Z')){
			if(c>='a' && c<='z')
			{
				if(c=='a'|| c=='e'|| c=='i'||c=='o'||c=='u') 
					System.out.println("lower case-- vowel");
				
					else 
						System.out.println("lower case -- consonant");
					
			}
			else {
					if(c=='A'|| c=='E'||c=='I'||c=='O'||c=='U') 
						System.out.println("upper case -- vowel ");
					
					else 
						System.out.println("upper case --- consonant");
				
			}
		}
		else if(c>='0' && c<='9') {
				System.out.println("<--digits-->");
			}
				else {
					System.out.println("special characters ");
				}
		}
		
	}


