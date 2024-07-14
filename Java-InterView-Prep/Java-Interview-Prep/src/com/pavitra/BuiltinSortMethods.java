package com.pavitra;

import java.util.Arrays;
import java.util.Collections;

public class BuiltinSortMethods {

	public static void main(String[] args) {
		
		//int a[] = {1,6,4,9,2,3};
		//System.out.println("Elements Before Sorting " + Arrays.toString(a));
    	//Arrays.parallelSort(a);
		//Arrays.sort(a);
		Integer a[] = {1,6,4,9,2,3};
		System.out.println("Elements Before Sorting " + Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder()); // this Collections.reverseOrder() accepts only Derived Type , 
		                                           //  it does not accepts primitive types 
		System.out.println("Elements After Sorting " + Arrays.toString(a));

	}

}
