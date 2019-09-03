package com.perficient;
import java.lang.*;
public class Multithreading extends Thread {
	public static void main (String args[]) throws InterruptedException
	{
		Multithreading obj=new Multithreading();
		obj.start();
		for(int j=1; j<=10; j++)
		{
			System.out.println("j:"+j);
			Thread.sleep(500);
		}
		System.out.println("Main Exiting...");
		}
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("i:"+i);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {}
		}
		System.out.println("Child Exiting...");
}
}