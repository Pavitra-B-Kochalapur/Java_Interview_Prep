package com.pavitra;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {

		//Approach1: Using FileReader & BufferedReader
		
		/*FileReader fr = new FileReader
				("C:\\Users\\Pavitra B K\\OneDrive\\Desktop\\FileReading\\FileReader.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		while((str = br.readLine()) != null)
		{
			System.out.println(str);
		}
		br.close();*/
		
		//Approach2: Using File & Scanner
		
		File f = new File
				("C:\\\\Users\\\\Pavitra B K\\\\OneDrive\\\\Desktop\\\\FileReading\\\\FileReader.txt");
        Scanner sc = new Scanner(f);  
		
		/*while(sc.hasNext())
		{
			System.out.println(sc.nextLine());
		}*/
        
        //Approach3: Using Delimiter
        sc.useDelimiter("\\Z");
        System.out.println(sc.next());
		
				
	}

}
