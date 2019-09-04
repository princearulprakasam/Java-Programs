package com.perficient;
import java.util.ArrayList;
public class ArrayListDemo1 {
public static void main(String args[]) {
	ArrayList al=new ArrayList();
	for(int i=10; i<=30; i+=10)
	{
		al.add(new Integer(i));
		al.add(new Integer(2));
	}
	System.out.println(al);
	al.remove(2);
	System.out.println(al);	
}
}
