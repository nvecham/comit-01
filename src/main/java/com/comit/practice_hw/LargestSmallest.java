package com.comit.practice_hw;

import java.util.Scanner;

public class LargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program in Java that reads two numbers on the keyboard and 
		 * say which is the largest and which is the smallest
		 */
		System.out.println(" Enter x : ");
		Scanner sc1 = new Scanner(System.in);
		int x = sc1.nextInt();
		
		System.out.println("Enter y : ");
		Scanner sc2 = new Scanner(System.in);
		int y = sc2.nextInt();
		
		if(x < y) {
			System.out.println(+x+ " is smaller than " +y );
		}else {
			System.out.println(+x+ " is greater than " +y );
		}

	}

}
