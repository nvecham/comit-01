package com.comit.practice_hw;

<<<<<<< HEAD
import java.util.Scanner;

class CalcOperations {

	double x;
	double y;
	char op;

	void selectOperation(double x, double y, char op) {

		switch (op) {

		case '+': {
			double add = x + y;
			System.out.println(add);
			break;
		}

		case '-': {
			double sub = x - y;
			System.out.println(sub);
			break;
		}

		case '*': {
			double mul = x * y;
			System.out.println(mul);
			break;
		}

		case '/': {
			double div = x / y;
			System.out.println(div);
			break;
		}

		}
	}

}

=======
>>>>>>> 0c9b46b3117f1ee336f34c1ba17ccf308e195f0e
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

<<<<<<< HEAD
		System.out.println("Enter first number : ");

		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();

		System.out.println("Enter second number : ");
		double y = sc.nextDouble();
		
		System.out.println("Enter one of the four operations  + - * / : ");
		String operator = sc.next();
		char op = operator.charAt(0);
		
		

		CalcOperations calc = new CalcOperations();
		calc.selectOperation(x, y, op);
		
		sc.close();
		
=======
>>>>>>> 0c9b46b3117f1ee336f34c1ba17ccf308e195f0e
	}

}
