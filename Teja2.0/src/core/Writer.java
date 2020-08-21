package core;


import java.io.FileWriter;
import java.io.IOException;


public class Writer {
	public static FileWriter fw;
	public static String letter="* Completed GIT";
	
	public static void main(String[] args) {
		try {
		fw=new FileWriter("C:\\Teja\\Teja2.0\\ProblemSolving\\Java\\Problems\\Teja2.0\\data\\Write");
		fw.write(letter);
		
		
		}catch(IOException f) {
			System.out.println(f);
		}
		
		finally {
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}

}
