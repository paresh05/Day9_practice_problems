package com.bridgelabzd9;

import java.util.Scanner;

// Program to check whether a number is prime or not

public class Primenumber {

	public static void main(String[] args) {
		System.out.println("Enter the a number");
		Scanner sc = new Scanner(System.in); 
		int N = sc.nextInt();
		int count=0;
		for(int i=3;i<=(N/2);i++)
		{
			int N1=N%i;
			if(N1==0)
			{
				System.out.println("Its is not a Prime number");
				count=count+1;
				break;
			}
			
		}
		//System.out.println(count);
		if(count==0)
			System.out.println("Its a Prime Number");

	}

}
