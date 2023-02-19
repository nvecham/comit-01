package com.comit.practice_hw;

import java.util.Scanner;

public class CADToUSDConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program in Java that converts from Canadian dollars to US dollars. 
		 * You will receive a decimal number corresponding to the amount in CAD and will answer with the corresponding amount in US dollars. Take the quotation of the dollar today
		 */
		double CAD;
		double USD;
		
		//1 CAD == 0.74 USD;
		
		System.out.println("Enter the amount : ");
		Scanner sc = new Scanner(System.in);
		CAD = sc.nextDouble();
		
		USD =  CAD*0.74;
		
		System.out.println(+CAD+" CAD in US Dollars is "+USD+ " USD");
		
		
		
	}

}
