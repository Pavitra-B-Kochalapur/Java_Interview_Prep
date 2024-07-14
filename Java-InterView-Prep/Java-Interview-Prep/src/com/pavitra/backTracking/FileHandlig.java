package com.pavitra.backTracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlig {

	public static void main(String[] args) {
		
		try {
			File f = new File("new-file.txt");
			f.createNewFile();
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
//		try {
//			File f = new File("newFile.txt");
//			f.createNewFile();
//			BufferedWriter bw =  new BufferedWriter(new FileWriter("---"));
//			bw.write("Hii , I am Pavitra ");
//			bw.close();	
//		}catch(IOException e){
//			System.out.println(e.getMessage());
//			
//		}
//		
//		
//		try {
//			BufferedReader br = new BufferedReader(new FileReader("----"));
//			
//			while(br.ready()) {
//				System.out.println(br.readLine());
//				
//			}
//			br.close();
//			
//		}catch(IOException e) {
//			System.out.println(e.getMessage());
//		}

	}

}
