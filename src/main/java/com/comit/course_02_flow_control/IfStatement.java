package com.comit.course_02_flow_control;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 28;

		// 1 Scenario

		if (a > b) {
			System.out.println("a is greater than b");
		} else if (a < b) {
			System.out.println("a is less than b");
		} else {
			System.out.println("a is equal to b");
		}

		// 2 Scenario

		if (a > b) {
			System.out.println("a is greater than b");
		}
		if (a < b) {
			System.out.println("a is less than b");
		}
		if (a == b) {
			System.out.println("a is equal to b");
		}

		// 3 Scenario - Nested ifs

		if (a > b) {
			if (a > 10) {

			}
		}
	}

}
