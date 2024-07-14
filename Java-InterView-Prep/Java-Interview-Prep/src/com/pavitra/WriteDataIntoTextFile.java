package com.pavitra;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter
				("C:\\\\Users\\\\Pavitra B K\\\\OneDrive\\\\Desktop\\\\FileReading\\\\FileReader123.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Welcome to SQL ");
		bw.write("Welcome to Python Programming ");
		bw.write("Welcome to Java");
		
		System.out.println("Finished!!!!!");
		
		bw.close();
		

	}

}
