package com.pavitra;

import java.util.Arrays;

public class EvenOddFromArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7};
		
		System.out.println("Even Numbers From Array");
		for(int value : a) {
			if(value % 2 == 0) {
				System.out.println(value);
			}
		}
		
		System.out.println("Odd Numbers From Array");
		for(int value: a) {
			if(value % 2 != 0) {
				System.out.println(value);
			}
		}

	}

}
