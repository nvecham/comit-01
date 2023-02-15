package com.comit.course_01_operators;

public class Unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int a = 5;
		
		//Post Increment 
		
		int b = a++;
		
		System.out.println("Post Increment");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		a = 5;
		//Pre Increment
		b = ++a;
		System.out.println("Pre Increment");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		a = 5;
		//Post Decrement
		b = a--;
		System.out.println("Post Decrement");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		a = 5;
		//Pre Decrement
		b = --a;
		System.out.println("Pre Decrement");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}

}
