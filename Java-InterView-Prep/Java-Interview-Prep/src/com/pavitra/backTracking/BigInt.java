package com.pavitra.backTracking;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigInt {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		BigInteger p  = BigInteger.valueOf(a);
		BigInteger k = BigInteger.valueOf(b); //convert int/long to BigInteger
		int c = k.intValue();  //convert BigInteger to Integer
		
		BigInteger C = new BigInteger("123456654321");
		BigInteger X = new BigInteger("988766456772");
		
		//constants
		BigInteger V = BigInteger.TEN;
		
		//addition
		BigInteger A = C.add(X);
		
		BigInteger M = C.multiply(X);
		
		BigInteger S = X.subtract(C);
		
		BigInteger D = X.divide(C);
		
		BigInteger R = X.remainder(C);
		
		System.out.println(R);
		
		if(C.compareTo(X) <0)
		{
			System.out.println("YES");
		}
		
		//BigDecimal
		BigDecimal bd = new BigDecimal("12345654");
		BigDecimal bd1 = new BigDecimal("567893");
		
		System.out.println(bd.add(bd1));
		System.out.println(BigDecimal.ONE);

	}

}
