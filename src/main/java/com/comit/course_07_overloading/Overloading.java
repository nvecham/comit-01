package com.comit.course_07_overloading;

/* 
 * Overloading is a situation where in the same class , two or more methods/constructors 
 * have the same name but different parameters.
 * */

class MyClass{
	
	int num;
	String str;
	
	/*
	 * Overloading works with only methods and constructors */
	
	/* 1.Constructor Overloading */
	
	MyClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	MyClass(String str) {
		this.str = str;
		// TODO Auto-generated constructor stub
	}
	
	MyClass(int num) {
		this.str = str;
		// TODO Auto-generated constructor stub
	}
	
	MyClass(String str, int num) {
		this.str = str;
		// TODO Auto-generated constructor stub
	}
	
	MyClass(int num, String str) {
		this.str = str;
		// TODO Auto-generated constructor stub
	}
	
	/* 2.Method Overload */
	
	String concatenate(String str, int num) {
		return str + " " + num;
	}
	
	String concatenate(int num, String str) {
		return str + " " + num;
	}
	
	String concatenate(String str) {
		return "Hello" +str;
	}
	
	int add(int a , int b) {
		return a + b ;
	}
	
	int add(int a , int b, int c) {
		return a + b + c ;
	}
	
	
	
}

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass obj1 = new MyClass();
		MyClass obj2 = new MyClass("ComIT");
		MyClass obj3 = new MyClass(1);
		MyClass obj4 = new MyClass("ComIT",1);
		
		/*Java knows which overloaded method you want to run from the data types of the parameter */
		
		System.out.println(obj1.concatenate("ComiT", 1));
		System.out.println(obj1.concatenate(1 , "ComiT"));
		System.out.println(obj1.concatenate("ComiT"));
		
		System.out.println(obj1.add(1, 2));
		System.out.println(obj1.add(1, 2, 3));

		

	}

}
