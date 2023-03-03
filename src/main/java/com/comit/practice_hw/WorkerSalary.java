package com.comit.practice_hw;

import java.util.Scanner;

<<<<<<< HEAD
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

=======
>>>>>>> 0c9b46b3117f1ee336f34c1ba17ccf308e195f0e
public class WorkerSalary {

	public static void main(String[] args) {
		
<<<<<<< HEAD
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
		
		
		
		
		
=======
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
>>>>>>> 0c9b46b3117f1ee336f34c1ba17ccf308e195f0e
	}

}
