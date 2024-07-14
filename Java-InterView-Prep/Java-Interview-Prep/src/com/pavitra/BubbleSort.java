package com.pavitra;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int a[] = {1,6,4,5,3,2};
		
		System.out.println("Array before Sorting: "+Arrays.toString(a));
		
		for(int i=0; i<a.length;i++)      //Number of Passes
		{
			for(int j=0; j<a.length-1;j++) // Iteration in each Pass
			{
				if(a[j]>a[j+1])
				{
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				}
			}
		}

		System.out.println("Array after Sorting: "+Arrays.toString(a));

	}

}
