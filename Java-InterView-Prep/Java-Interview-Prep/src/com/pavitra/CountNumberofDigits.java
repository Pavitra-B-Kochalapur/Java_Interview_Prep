package com.pavitra;

import java.util.Scanner;

public class CountNumberofDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number ");
		int num = sc.nextInt();
		int count = 0;
		
		while(num!=0) {
			num = num/10;
			count++;
		}

		System.out.println("Number of Digits: "+count);
	}

}
