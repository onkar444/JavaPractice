package com.practice;
import java.awt.desktop.SystemSleepEvent;
import java.util.*;

public class Calculator {
	public void addition(int a, int b) {
		int ans = a + b;
		System.out.println("Addition::" + ans);
	}

	public void subtraction(int a, int b) {
		int ans = a - b;
		System.out.println("Subtraction::" + ans);
	}

	public void multiplication(int a, int b) {
		int ans = a * b;
		System.out.println("Multiplication::" + ans);

	}

	public void division(int a, int b) {
		int ans = a / b;
		System.out.println("Division::" + ans);

	}

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number 1::");
		int a=scanner.nextInt();
		System.out.println("Enter number 2::");
		int b=scanner.nextInt();
		System.out.println("Enter Operation::\n1)Addition\n2)Subtraction\n3)Multiplication\n4)Division");
		int key=scanner.nextInt();	
		Calculator calculator=new Calculator();
		switch (key) {
		case 1: {
			calculator.addition(a, b);
			break;
		}
		case 2:{
			calculator.subtraction(a, b);
			break;
		}
		case 3:{
			calculator.multiplication(a, b);
			break;
		}
		case 4:{
			calculator.division(a, b);
			break;
		}
		default:{
			System.out.println("Invalid Input "+key);
		}
		}
	}

}
