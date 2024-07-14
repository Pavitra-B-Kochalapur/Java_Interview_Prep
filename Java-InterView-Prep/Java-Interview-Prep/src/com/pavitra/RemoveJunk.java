package com.pavitra;

public class RemoveJunk {

	public static void main(String[] args) {
		
		//to remove somthing junk 0r SpecialChars in string we can use regex: [^a-zA-Z0-9]
		String s = "%@!$* Selenium Testing Java";
		s= s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
		

	}

}
