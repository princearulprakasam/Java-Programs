package com.perficient;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyImage {
	public static void main(String[]args) throws Exception
	{
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try
		{
			fis = new FileInputStream("g:/input.jpg");
			fos = new FileOutputStream("g:/output.jpg");
			int ch;
			while((ch=fis.read()) != -1) 
			{
			fos.write(ch);
			}
			System.out.println("Image copied successfully...");
		}
		finally
		{
			if(fis != null)
			{
				fis.close();
			}
			if(fos != null)
			{fos.close();
			}
		}
	}
}

