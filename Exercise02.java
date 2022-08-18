package com.ex.demo;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
public class Exercise02 {

	public static void main(String[] args) {
		
		FileReader in= null;  //to read the file
		BufferedReader b=null; //used to read the text from a character
		
		try {
			List<String>lines=new ArrayList<String>();
			
			in=new FileReader("text.txt");
			b=new BufferedReader(in);
			
			String line=b.readLine();
			
			while(line != null){
				lines.add(line);
				
				line=b.readLine();
				
				if (line==null)
					break;
			}
				
			String[] str= lines.toArray(new String[lines.size()]);
			 
				for(String s :str) {
					System.out.println("\n\n"+s);
				}
		}
		catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
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
	

