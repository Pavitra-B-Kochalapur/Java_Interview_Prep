package com.pavitra;

public class Reverse_a_String {

	public static void main(String[] args) {
		String str= "ABCD";
		//String rev= "";
		
		int len = str.length();
		
		//1. using concatenate operation +
		/*for(int i=len-1; i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println("Reversed String is: "+ rev);*/
		
		//2. using toCharArray
		/*char s[]= str.toCharArray();
		for(int i=len-1; i>=0; i--) {
			rev= rev+s[i];
		}
		System.out.println("Reversed String is: "+ rev);*/
		
		//3. using StringBuffer
		
		StringBuffer sb = new StringBuffer(str);
		StringBuffer rev = sb.reverse();
		System.out.println("Reversed String is: "+ rev);

	}

}
