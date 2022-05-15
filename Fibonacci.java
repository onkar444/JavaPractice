package com.practice;

import java.util.Scanner;

public class Fibonacci {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3=0,i=2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number::");
		int num=scanner.nextInt();
		System.out.print(n1+" "+n2);
		while(i<=num)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			i++;
		}
	}

}
