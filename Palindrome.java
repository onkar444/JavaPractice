package com.practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string::");
		String wordString=scanner.nextLine();
		String revString="";
		int strLength=wordString.length();
		for(int i=strLength-1;i>=0;i--)
		{
			revString=revString+wordString.charAt(i);
			
		}
		
		if(revString.toLowerCase().equals(wordString.toLowerCase()))
		{
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
		
	}
}
