package com.bridgelabzd9;
import java.util.Random;

//Program to generate a coupon of distinct numbers

public class Coupon {
	
	
	public static void random()
	{
		int a=0,i=0;
		int arr[];
		arr=new int[10];
		Random random = new Random(); // to generate random numbers from 1 to 10
		
		System.out.print("The Coupon Number is ");
		for(i=0;a==0;i++)
		{
			int couponNum = random.nextInt(10);
			// To check whether the number is not repeated
			for(int a1=0;a1<=i;a1++)  
			{
				if(arr[a1]==couponNum)
				{
					a=1;
					break;
				}	
			}
			if(a==0)
			{
				arr[i]=couponNum;
				System.out.print(couponNum);
			}
		}
	}
	

	public static void main(String[] args) {
		random(); // function call to the random function
		}
	}

