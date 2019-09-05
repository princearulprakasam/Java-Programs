package com.perficient;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreams {
	public static void main(String[]args) throws IOException
	{
		FileReader fr = null;
		FileWriter fw = null;
		try
		{
			fr = new FileReader("g:/input.jpg");
			fw = new FileWriter("g:/output.jpg");
			int ch;
			while((ch = fr.read()) != -1)
					{
				fw.write(ch);
					}
			System.out.println("copied...");
		}
		finally
		{
			if(fr != null)
			{
				fr.close();
			}
			if(fw != null)
			{
				fw.close();
			}
		}
	}
}	
	


