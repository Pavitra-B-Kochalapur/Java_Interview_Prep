package com.pavitra;

import java.util.Random;

public class GenerateRandomNumberAndString {

	public static void main(String[] args) {

		//using Random class: we can generate both int and decimal numbers
		
		Random rand = new Random();
		/*int rand_int = rand.nextInt(100);
		System.out.println(rand_int);*/
		
		double rand_dbl = rand.nextDouble(10);
		System.out.println(rand_dbl);
		
		//using Math class: we can generate only random decimal number
		//System.out.println(Math.random());
		
		

	}

}
