package com.comit.practice_hw;

import java.util.Scanner;

public class ReadIntegerAddNext100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program in Java that reads an integer from the keyboard and makes the sum of the 
		 * next 100 numbers, showing the result on screen
		 */
		
		int sum = 0;
		System.out.println("Enter an integer : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = num;i<=(num+100);i++) {
			sum = sum+i;
		}
		
		System.out.println(sum);
		
		

	}

}
