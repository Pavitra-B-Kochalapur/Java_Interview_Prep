package com.pavitra;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		System.out.println("Before swapping numbers are "+a+" "+b);
		
		//Logic-1: using third variable
		/*int temp = a;
		a = b;
		b= temp;*/
		
		//Logic2: using + & - without using third variable
		/*a = a+b;
		b= a-b;
		a= a-b;*/
		
		//Logic3: using * & /  without using third variable
		/*a= a*b;
		b= a/b;
		a= a/b;*/
		
		//Logic4: bitwise XOR 
		/*a = a^b;
		b= a^b;
		a= a^b;*/
		
		//Logic5: single statement
		b=a+b - (a=b);
		
		
		System.out.println("After swapping numbers are "+a+" "+b);

	}

}
