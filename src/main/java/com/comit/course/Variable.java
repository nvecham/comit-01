package com.comit.course;

public class Variable {
	
	public static void main(String[] args) {
		
		/*
		 * comment
		 * 		Integer Variables 
		 */
		
		/* Declaration and Initialization*/
		int a = 10; // 4 bytes
		long b = 1000000; //8 bytes
		
		short c= Short.MAX_VALUE; // 2 bytes
		byte d = Byte.MAX_VALUE; //1 byte
		
		//Decimal Variables
		
		double e = 10.456; // 8 bytes
		float f = 14.45321786023f; // 4 bytes -- picks only first 8
		
		//Text Variables
		
		char g = 'A'; // 2 bytes
		
		boolean h = true;

		
		System.out.println(f);
		System.out.println("This is a modiication");
	}

}
