package com.comit.course_01_operators;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = true;
		boolean b = false;
		
		boolean and = a && b; // returns true only if both operands are true
		boolean or = a || b; // returns false only if both operands are false
		boolean not = !a; //The not returns the opposite
		
		System.out.println(and);
		System.out.println(or);
		System.out.println(not);
		
		

	}

}
