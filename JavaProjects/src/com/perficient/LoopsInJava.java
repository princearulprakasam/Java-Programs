package com.perficient;
import java.util.*;
public class LoopsInJava {
public static void main (String args[]){
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the 4 digit pin");
	int pin=sc.nextInt();
	if (pin>=1000&&pin<=9999)
	{
		System.out.println("Aunthorized entry");
		System.out.println("Enter the amount:");
		long amount=sc.nextInt();
		if (amount%100==0) {
			System.out.println("Collect your cash!");
		} 
		else {
			System.out.println("Enter amount multiples of 100");
			System.out.println("Enter the amount:");
			long amount1=sc.nextInt();
			if (amount1%100==0) {
				System.out.println("Collect your cash!");
			}
			else
			{
			System.out.println("Invalid Transaction \n Try Again!");				
			} 
		    }
	        }
	else {
		System.out.println("Unauthorized Login");
			}
}
}