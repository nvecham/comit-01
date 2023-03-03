package com.comit.practice_hw;

import java.util.Scanner;

class Employee{
	
	String name;
	double salary;
	
	
	Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	
	void displayDetails(String name, double salary) {
		System.out.println("Name of the employee : "+name);
		System.out.println("salary of the employee : "+salary);
	}
	
	double updateSalary(double salary) {
		
		if(salary<1000) {
			salary = salary + (0.15*salary);
			System.out.println("New increased salary is : "+salary);
		}else {
			salary = salary + (0.12*salary);
			System.out.println("New increased salary is : "+salary);
		}
		
		return salary;
		
	
		
	}
	
}

public class WorkerSalary {

	public static void main(String[] args) {
		
		System.out.println("Enter the name of the employee : ");
		Scanner sc =  new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.println("Enter the current salary of the worker : ");
		double salary = sc.nextDouble();
		
		Employee emp = new Employee(name, salary);
		emp.name = name;
		emp.salary = salary;
		
		sc.close();
		
		emp.displayDetails(name, salary);
		emp.updateSalary(salary);
		
		
		
		
		
	}

}
