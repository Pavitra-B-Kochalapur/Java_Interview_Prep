package com.pavitra;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		//Array should be in sorted order 
		// binary search is faster than linear search
		int a[] = {1,2,3,4,5,6,7,8,9};
		int target = 3;
		boolean flag = false;
		
		int l = 0;
		int h = a.length-1;
		
		/*while(l <= h)
		{
			int mid = (l+h)/2;
			
			if(target == a[mid])
			{
				System.out.println("Element Found..");
				flag = true;
				break;
			}
			if(target > a[mid])
			{
				l = mid + 1;
			}
			if(target < a[mid])
			{
				h = mid - 1;
			}
		}
		
		if(flag == false)
		{
			System.out.println("Element not Found..");
		}*/
		
		// Logic 2: using inbuilt Arrays.binarySearch()
		System.out.println(Arrays.binarySearch(a, target));
		

	}

}
