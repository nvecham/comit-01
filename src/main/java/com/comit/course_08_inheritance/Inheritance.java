package com.comit.course_08_inheritance;

class Person{ //Parent class
	
	String name;
	int age;
	
	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}
	
	void setName(String name) {
		this.name = name;
	}

	void setAge(int age) {
		this.age = age;
	}
	
	/* toString method returns a string that textually represents this object */
	
	 @Override 
	 public String toString() { 
		  return "Person [name=" + name + ", age="	  + age + "]"; 
	}
}

//DRY Principle - Don't repeat yourself (Reuse code)

class Employee extends Person{  //child class
	
	int id;
	double salary;
	String position;
	
	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	String getPosition() {
		return position;
	}

	void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", position=" + position + ", name=" + name + ", age="
				+ age + "]";
	}
	
	
	
}

class Accountant extends Employee{  //Multilevel Inheritance
	
}

class Customer extends Person{
	
}

public class Inheritance {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		emp1.setName("Joe");
		emp1.setAge(30);
		emp1.setId(1);
		emp1.setSalary(30000);
		emp1.setPosition("Assistant");
		
		//system.out.println() calls the toString method automatically when it receives an object
		//System.out.println(emp1.toString()); -- this line is same as below
		System.out.println(emp1);
		
		Customer cus1 = new Customer();
		cus1.setName("John");
		cus1.setAge(25);
		
		//system.out.println() calls the toString method automatically when it receives an object
		System.out.println(cus1);
		
		Accountant acc1 = new Accountant();
		acc1.setName("Jane");
		acc1.setAge(35);
		acc1.setId(2);
		acc1.setSalary(40000);
		acc1.setPosition("Accountant");
		
		//system.out.println() calls the toString method automatically when it receives an object
		System.out.println(acc1);
	}

}
