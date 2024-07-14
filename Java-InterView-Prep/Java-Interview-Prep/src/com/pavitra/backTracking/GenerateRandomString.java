package com.pavitra.backTracking;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class GenerateRandomString {

	public static void main(String[] args) {
		int size = 16;
		StringBuffer sb = new StringBuffer(size);
		Random r = new Random();
		for(int i=0; i<size; i++)
		{
		char randomchar = (char)(97+(int)(r.nextFloat()*26));
		sb.append(randomchar);
		}
		System.out.println(sb.toString());
//		char ch = 'a';
//		System.out.println(ch+0);
		
		//remove white space
		String s = "pi kjj     hyg    jjj  kkj";
		String p = s.replaceAll("\\s", "");
		System.out.println(p);
		
		//split 
		String b = "Pavitra pallavi suma basavaraj";
		String[] bb = b.split(" ");
		System.out.println(Arrays.toString(bb));

		//DecimalFormat - Rounding Off
		DecimalFormat df = new DecimalFormat("00.000");
		System.out.println(df.format(7.29));
		
	}

}
