package com.pavitra;

import java.util.Scanner;

public class CountEvenandOddNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number ");
		int num = sc.nextInt();
		int countE = 0;
		int countO = 0;
		
		while(num!=0) {
			int rem= num%10;
			num = num/10;	
			
			if(rem%2 == 0)
			{
				countE++;
			}else {
				countO++;
			}
			
			
		}
		
		System.out.println("Number of Even Digits: " + countE);
		System.out.println("Number of Odd Digits: " + countO);

	}

}
