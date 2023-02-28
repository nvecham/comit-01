package com.comit.practice_hw;

import java.util.Scanner;

public class WorkerSalary {

	public static void main(String[] args) {
		
		System.out.println("Enter the current salary of the worker : ");
		
		Scanner sc =  new Scanner(System.in);
		double sal = sc.nextDouble();
		
		if(sal<1000) {
			sal = sal + (0.15*sal);
			System.out.println("New increased salary is : "+sal);
		}else {
			sal = sal + (0.12*sal);
			System.out.println("New increased salary is : "+sal);
		}
		
		sc.close();
	}

}
