package com.perficient;
import java.util.*;
public class SwitchCaseInJava {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Choose your postpaid plan [199, 399, 599, 799, 999]:");
	String plan = sc.nextLine();
	switch(plan) {
	case "199":
		System.out.println("Validity - 30 Days\nUnlimited calls\nFree 100 sms/day\n2 GB Data/day ");
		break;
	case "399":
		System.out.println("Validity - 30 Days\nUnlimited calls\nFree 100 sms/day\n4 GB Data/day");
		break;
	case "599":
		System.out.println("Validity - 30 Days\nUnlimited calls\nFree 100 sms/day\n6 GB Data/day");
		break;
	case "799":
		System.out.println("Validity - 30 Days\nUnlimited calls\nFree 100 sms/day\n8 GB Data/day");
		break;
	case "999":
		System.out.println("Validity - 30 Days\nUnlimited calls\nFree 100 sms/day\n10 GB Data/day");
		}
}
}