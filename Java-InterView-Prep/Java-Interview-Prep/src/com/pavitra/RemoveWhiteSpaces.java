package com.pavitra;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		String s =(" Java               Programming  and            Test        Automation");
		s = s.replaceAll("\\s","");
		System.out.println(s);

	}

}
