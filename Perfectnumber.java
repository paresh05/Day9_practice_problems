package com.bridgelabzd9;

import java.util.Scanner;
//Program to check a number is a perfect number or not

public class Perfectnumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the value of N");
		Scanner sc = new Scanner(System.in); 
		int N = sc.nextInt();
		int count=0;
		for(int i=1;i<=(N/2);i++)
		{
			int N1=N%i;
			if(N1==0)
			{
				count=count+i;
			}
			
		}
		if(count==N)
			System.out.println("Its a perfect Square");
		else
			System.out.println("Not a perfect Square");

	}

}
