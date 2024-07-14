package com.pavitra;

public class MaxMinNumberinArray {

	public static void main(String[] args) {
		
		int a[] = {40,20,50,100};
		int max = a[0];
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Maximum Number is: "+ max);
		
		int min = a[0];
		for(int i=1; i<a.length; i++) 
		{
			if(a[i] < min) 
			{
				min = a[i];
			}
		}
		System.out.println("Minimum Number is: "+ min);

	}

}
