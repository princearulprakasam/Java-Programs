package com.perficient;
import java.util.*;
public class OperatorsInJava {
	public static void main (String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Customer Name:");
		String name=sc.nextLine();
		System.out.println("Enter Units Consumed:");
		int units=sc.nextInt();
		float charges;
		if (units<=200) {charges = 100 + (units*0.5f);}
		else if (units>200&&units<400) {charges = 250 + (units-200)*0.65f;}
		else if (units>400&&units<600) {charges = 250 + (units-400)*0.75f;}
		else {charges=500 + (units-600)*0.95f;}
		{
			System.out.println("Charges to be paid:"+charges);
		}
	}
	}
