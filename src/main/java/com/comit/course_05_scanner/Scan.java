package com.comit.course_05_scanner;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Accepting input from keyboard
		
		try(Scanner sc = new Scanner(System.in)){
		
		System.out.println("Please enter an integer");
		int i = sc.nextInt();
		
		System.out.println("Please enter a double");
		double d = sc.nextDouble();
		sc.nextLine();//to clear the buffer, read the return key (ASCII 13) left;
		
		System.out.println("Please enter a String");
		String s = sc.nextLine();
		
		System.out.println("Your input : "+i);
		System.out.println("Your input : "+d);
		System.out.println("Your input : "+s);
		
		//sc.close();
		
		}
		
		
		
	}

}
