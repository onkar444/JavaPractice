package com.practice;

import java.util.Scanner;

public class PermutationAndCombination {

	
	public static int factorial(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f*=i;
		}
		return f;
		
	}
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		System.out.println("Enter n1:");
		int n1=inScanner.nextInt();
		System.out.println("Enter n2");
		int n2=inScanner.nextInt();
		
		int p=(int)(factorial(n1)/(factorial(n1-n2)));
		int c=(int)factorial(n1)/(factorial(n1-n2)*factorial(n2));
		
		System.out.println("Permutation::"+p);
		System.out.println("Combination::"+c);
	}

}
