package core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reader {
	
	public static FileReader fr;
	public static int ch;
	public static String data;
	public static String file="C:\\Teja\\Teja2.0\\ProblemSolving\\Java\\Problems\\Teja2.0\\data\\Test";
	
	public static void main(String[] args) {
		
		try {
			fr=new FileReader("C:\\Teja\\Teja2.0\\ProblemSolving\\Java\\Problems\\Teja2.0\\data\\Read");
			
			try {
				while((ch=fr.read())!=-1) {
					System.out.print((char)ch);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
