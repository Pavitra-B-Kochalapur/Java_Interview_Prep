package com.pavitra;

public class ReverseEachWordsinaString {

	public static void main(String[] args) {
		
		String str = "Welcome to Java World";
		String[] words = str.split(" ");
		
		//Logic1
		/*String reverseString = "";
		
		for(String w:words)
		{
			String reverseWord = "";
			for(int i=w.length()-1; i>=0; i--)
			{
				reverseWord = reverseWord + w.charAt(i);
			}
			
			reverseString = reverseString + reverseWord + " ";
		}
		
		System.out.println(reverseString);*/
		
		//Logic2
		String reverseWord = "";
		for(String w : words)
		{
		StringBuilder sb = new StringBuilder(w);
		sb.reverse();
		reverseWord = reverseWord + sb.toString()+" ";
		}
		System.out.println(reverseWord);

	}

}
