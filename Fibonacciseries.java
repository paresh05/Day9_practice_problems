package com.bridgelabzd9;

import java.util.Scanner;

public class Fibonacciseries {
	// Program to print N Fibonacci Number

	public static void main(String[] args) {
		int f0=0;
		int f1=1;
		System.out.println("Enter the value of N");
		Scanner sc = new Scanner(System.in); 
		int N = sc.nextInt();
		System.out.println("The Fibonacci Series is: ");
		System.out.print(f0);
		System.out.print(" "+f1);
		for (int i=2;i<N;i++)
		{
			int fn=f0+f1;
			System.out.print(" "+fn);
			f0 =f1;
			f1=fn;
		}

	}

}
