package com.ex.demo;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Exercise03 {

	public static void main(String[] args) {
		
	
		try {
		Scanner s=new Scanner(new File("text.txt"));
		
		String current;
		String longword = "";
		
		while(s.hasNext()) {
			current=s.next();
			
			if(current.length()>longword.length()) {
				longword=current;
			}
		}
		System.out.println("the longest word is:"+longword);
		}
	
		catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}




