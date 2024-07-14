package com.pavitra.mergeSort;

public class Permutation {

	public static void main(String[] args) {
		//permutation("", "abc");
		System.out.println(permutationCount("", "abcd"));
		

	}
	
	static void permutation(String p, String up)
	{
		if(up.isEmpty())
		{
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		for(int i = 0; i<=p.length(); i++)
		{
			String first = p.substring(0,i);
			String second = p.substring(i,p.length());
			permutation(first + ch + second, up.substring(1));
		}
	}
	
	static int permutationCount(String p, String up)
	{
		if(up.isEmpty())
		{
			return 1;
		}
		
		int count = 0;
		char ch = up.charAt(0);
		for(int i = 0; i<=p.length(); i++)
		{
			String first = p.substring(0,i);
			String second = p.substring(i,p.length());
			count = count + permutationCount(first + ch + second, up.substring(1));
		}
		return count;
	}


}
