package com.pavitra;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter you String ");
		String str = sc.next();
		
		String org_Str = str;
		String rev = "";
		
		int len = str.length();
		char a[] = str.toCharArray();
		for(int i=len-1; i>=0; i--) 
		{
			rev= rev+a[i];
		}
		
		System.out.println(rev);
		
		if(org_Str.equals(rev))
		{
			System.out.println(org_Str + " is a Palidrome String");
		}
		else
		{
			System.out.println(org_Str + " is Not a Palidrome String");
		}

	}

}
