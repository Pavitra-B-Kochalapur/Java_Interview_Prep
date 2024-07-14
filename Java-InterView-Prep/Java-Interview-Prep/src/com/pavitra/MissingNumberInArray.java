package com.pavitra;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		//Array should not contain duplicates
		//Array should in proper Range
		
		int a[] = {1,2,3,4,5,7};
		int sum1=0;
		int sum2=0;
		
		for(int i=0; i<a.length;i++) {
			sum1 = sum1 + a[i];
		}
		//System.out.println("Sum of Elements in Array: " + sum1);
		
		for(int i=1; i<=7; i++) {
			sum2 = sum2 + i;
		}
		//System.out.println("Sum of Range of Elements in Array: " + sum2);
		
		int missingNumber = sum2 - sum1;
		System.out.println("Missing Number is: "+missingNumber);
	}

}
