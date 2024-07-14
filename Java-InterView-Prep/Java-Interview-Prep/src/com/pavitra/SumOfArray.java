package com.pavitra;

public class SumOfArray {

	public static void main(String[] args) {
		
		int a[] = {2,4,8,3,9};
		int sum = 0;
		
		/*for(int i=0; i<a.length;i++) {
			sum = sum + a[i];
		}*/
		
		for(int value:a) {
			sum = sum + value;
		}
		System.out.println("Sum of Array Elements : " + sum);

	}

}
