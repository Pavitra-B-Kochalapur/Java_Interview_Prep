package com.pavitra;

import java.util.Scanner;

public class Reverse_A_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number here!");
		int num = sc.nextInt();
		
		//Logic1: using algorithm
		/*int rev = 0;
		while(num != 0) {
			rev = rev*10 + num%10;
			num = num/10;
		}*/
		
		//Logic2: using StringBuffer
		
		/*StringBuffer sb = new StringBuffer(String.valueOf(num));//converting int into string 
		StringBuffer rev = sb.reverse();*/
		
		//Logic3: using StringBuilder
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		 
		System.out.println("Reversed Number is: "+ rev);

	}

}
