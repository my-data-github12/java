package com.sunbeam;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 3. Write a program that inputs 4 lines and stored them in a text ﬁle. 
 * Use BuﬀeredWriter class.
 */
public class BufferWritter {
	public static void writeData() {
		try(FileWriter fout = new FileWriter("Paragraph.txt")) {
			try(BufferedWriter bout = new BufferedWriter(fout)) {
//				String para = "Java is a widely used object-oriented programming language "
//						+ "and software platform that runs on billions of devices, including notebook "
//						+ "computers, mobile devices, gaming consoles, medical devices and many others. "
//						+ "The rules and syntax of Java are based on the C and C++ languages.";
//				byte b[]=para.getBytes();
				
				for(int i=1; i<=4; i++) {
					System.out.println("Enter string :");
					String line = new Scanner(System.in).nextLine();
					bout.write(line);
					}
				String line = new Scanner(System.in).nextLine();
				bout.write(line);
				bout.newLine();
				}
			} // dout.close();
 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} // fout.close();
	
	public static void main(String[] args) {
		writeData();

		
		
	}
	}
