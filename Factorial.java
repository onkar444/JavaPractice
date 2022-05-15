package com.practice;
import java.util.Scanner;

public class Factorial {
	public int factorial(int a) {
		
		int fact=a;
		if(a<1)
		{
			return 1;
		}
		else {
		
			fact*=(factorial(fact-1));
			return fact;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a number::");
		int a=scanner.nextInt();
		Factorial factorial=new Factorial();
		int fact= factorial.factorial(a);
		System.out.println("Factorial of "+a+" is "+fact);
	}
}
