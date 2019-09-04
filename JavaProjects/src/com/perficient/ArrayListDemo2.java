package com.perficient;
import java.util.ArrayList;
public class ArrayListDemo2 {
	public static void main (String args[]) {
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(30);
		al1.add(20);
		System.out.println(al1);
		al1.add(1,100);
		System.out.println(al1);
		ArrayList al2 = new ArrayList();
		al2.add(30);
		al2.add(10);
		al2.addAll(al2);
		System.out.println(al1);
		al1.addAll(2,al2);
		System.out.println(al1);
		System.out.println("ele @ pos 3 :"+al1.get(3));
		System.out.println("no. of elements:" +al1.size());
		al1.set(4,200);
		System.out.println(al1);
		al1.clear();
		System.out.println(al1);
		if(al1.isEmpty())
			System.out.println("al1 list is empty");
		else
			System.out.println("al1 contains elements");			
	}

}
