package com.pavitra;

public class LinearSearch {

	public static void main(String[] args) {
		int a[] = {10,20,40,30,50};
		int target = 60;
		boolean flag = false;
		for(int i=0; i<a.length; i++)
		{
			if(a[i] == target)
			{
				System.out.println("Target Found At: "+i);
				flag = true;
			}
		}
		if(flag == false)
		{
			System.out.println("Target Not Found");
		}

	}

}
