package com.ex.demo;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Exercise01 {

	public static void main(String[] args) {
		FileReader in =null;
		BufferedReader b=null;
		
		try {
			 in=new FileReader("text.txt"); //read the file
			 
			 b=new BufferedReader(in); 
			 
			 String In;
			 
			 while((In=b.readLine())!=null){  //read the line one by one 
				
				 System.out.println(In);
			 }
			 
		}
		catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		
		catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
			try {
			if(in!=null)
				in.close();
			
			if(b!=null)
				b.close();
		}
			catch(IOException ex) {
				ex.printStackTrace();
			}
		}

	}

}
