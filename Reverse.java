package com.bridgelabzd9;

import java.util.Scanner;

//Program to Reverse a number

public class Reverse {

	public static void main(String[] args) {
		System.out.println("Enter the a number");
		Scanner sc = new Scanner(System.in); 
		int N = sc.nextInt();
		int quotient=N;
		int rem=0;
		int reverseNumber=0;
		//Reverses a number using modulo concept
		while(quotient>0)
		{
			rem=quotient%10;
			quotient/=10;
			reverseNumber+=rem;
			if(quotient>0)
				reverseNumber*=10;			
		}
		System.out.println("The reversed number is: "+reverseNumber);
		
	}

}
