package com.sunbeam;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
/*
 * 4. Read a text ﬁle line by line and display on terminal. 
 * Hint: ﬁle --> FileReader --> BuﬀeredReader -->
 */

public class ReadFile {

	public static void main(String[] args) {
		
		
		String path = "/home/sunbeam/Documents/git_data/java/Assignment15/Question3/Paragraph.txt";
		File file = new File(path);
		if(! file.exists()) {
			System.out.println("Path doesn't exists.");
			System.exit(1);
		}
//		if(file.isDirectory()) {
//			String[] list = file.list();
//			for (String f : list)
//				System.out.println(f);
//		}
		if(file.isFile()) {
			
			try(FileReader fin = new FileReader(path)) {
				try(BufferedReader  bin = new BufferedReader (fin)) {
//					String line = (String) bin.read();
					String line;
					while( (line =(String) bin.readLine())!=null){
						System.out.println(line);
					}
				}
		}catch(Exception e) {
			e.printStackTrace();}
		}

	}

}

