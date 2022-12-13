package com.dio.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Enter the first value: ");
		a = scan.nextInt();
		System.out.println("Enter the second value: ");
		b = scan.nextInt();
		
		int sum = sum(a,b);
		int subtraction = subtraction(a,b);
		int multiplication = multiplication(a,b);
		int division = division(a,b);
		
		System.out.println("sum " + sum);
		System.out.println("subtraction " + subtraction);
		System.out.println("multiplication " + multiplication);
		System.out.println("division " + division);
		
		scan.close();
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}

	public static int subtraction (int a, int b) {
		return a - b;
	}
	
	public static int division (int a, int b) {
		return a / b;
	}
	
	public static int multiplication (int a, int b) {
		return a * b;
	}
}
