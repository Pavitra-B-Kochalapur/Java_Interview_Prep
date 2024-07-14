package com.pavitra;

import java.util.HashMap;
import java.util.HashSet;

public class DuplicateElementsinArray {

	public static void main(String[] args) {
		String a[] = {"java","python","c","c++","kotlin","java"};
		boolean status = false;
		//Logic-1
		/*for(int i=0;i<a.length;i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
					System.out.println("Duplicate Element Found: "+a[i]);
					status = true;
				}
			}
		}
		
		if(status == false)
		{
			System.out.println("Duplicates Element not Found ");
		}*/
		
		//Logic-2: using HashSet it does not contains duplicates
		HashSet<String> hs = new HashSet<>();
		
		
		for(String arr:a) 
		{
			
			if(hs.add(arr)==false)
			{
				System.out.println("Duplicate Element Found: "+arr);
				status = true;
			}
		}
		if(status == false)
		{
			System.out.println("Duplicate Element not Found ");
		}
		

	}

}
