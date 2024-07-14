package com.pavitra;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num = 5;
		int count = 0;
		//only divide by 1 and itself
		if(num>1) {
			for(int i=1; i<=num; i++) {
				if(num%i == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println("Prime number");
			}else {
				System.out.println("Not a Prime number");
			}
			
		}else {
			System.out.println("Not a Prime Number ");
		}
		

	}

}
