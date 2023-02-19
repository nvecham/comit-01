package com.comit.course_02_flow_control;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 4;

		/*
		 * switch(day) {
		 * 
		 * case 1: System.out.println("Monday"); break; case 2:
		 * System.out.println("Tuesday"); break; case 3:
		 * System.out.println("Wednesday"); break; case 4:
		 * System.out.println("Thursday"); break; case 5: System.out.println("Friday");
		 * break; case 6: System.out.println("Saturday"); break; case 7:
		 * System.out.println("Sunday"); break; default:
		 * System.out.println("Invalid day"); }
		 */

		// Simplified Switch Statement

	/*	switch (day) {

		case 1 -> System.out.println("Monday");
		case 2 -> System.out.println("Tuesday");
		case 3 -> System.out.println("Wednesday");
		case 4 -> System.out.println("Thursday");
		case 5 -> System.out.println("Friday");
		case 6 -> System.out.println("Saturday");
		case 7 -> System.out.println("Sunday");

		default -> System.out.println("Invalid day");

		}*/
		
		//Assigning values with simplified switch
		
		String name = switch(day) {
		 
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 ->"Wednesday";
		case 4 ->"Thursday";
		case 5 ->"Friday";
		case 6 ->"Saturday";
		case 7 ->"Sunday";

		default ->"Invalid day";
		
		};
		
		System.out.println(name);

	}

}
