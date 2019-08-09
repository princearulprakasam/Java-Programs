package com.perficient;
import java.util.*;
public class Ifelse {
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		if (age>=18)
		{
			System.out.println("Eligible to vote");
					}
		else
		{
			System.out.println("Not eligible to vote");
}
}
}