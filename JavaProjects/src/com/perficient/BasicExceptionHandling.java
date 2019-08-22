package com.perficient;
class Ex
{
	void display()
	{
		try
		{
			int a=5/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Exception Handled 1");
	}
	void displ()
	{
		try
		{
			int a[]=new int[5];
			a[6]=5;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Exception Handled 2");
	}
	void disp()
	{
		try
		{
			String str="hello";
			int num=Integer.parseInt(str);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Exception Handled 3");
	}
	void dis()
	{
		try
		{
			String str=null;
			System.out.println(str.length());			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Exception Handled 4");
	}		
}
public class BasicExceptionHandling {
	public static void main(String args[])
	{
		Ex obj=new Ex();
		obj.display();
		obj.displ();
		obj.disp();
		obj.dis();
	}
}
