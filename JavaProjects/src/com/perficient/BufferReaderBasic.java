package com.perficient;
import java.io.BufferedReader;
import java.io.FileReader;
public class BufferReaderBasic {
	public static void main(String args[]) throws Exception {
	FileReader fr=new FileReader("C://Users//prince.muthuselvan//Desktop//Demo.txt");   //File Location URL
	BufferedReader br=new BufferedReader(fr);
	String str=br.readLine();
	System.out.println(str);
}
}
