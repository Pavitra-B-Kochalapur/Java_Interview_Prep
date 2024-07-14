package com.pavitra;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		
		String s = "Java Programming Java OOps ";
		int totalCount = s.length();
		int totalCount_afterRemove = s.replace("m", "").length();
		int count = totalCount - totalCount_afterRemove;
		System.out.println("Number of Occurances of a: "+ count);

	}

}
