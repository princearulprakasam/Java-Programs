package com.perficient;
import java.util.*;
public class LinearSearchTech {
	public static void main(String args[]) {
		int arr[]= {72,42,24,56,13,12,7};
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the element to be searched : ");
		int ele=sc.nextInt();
		int i=0;
		for(;i<arr.length;i++) {
			if(arr[i]==ele) {
				System.out.println("Element found at location : " +(i+1));
				break;
			}
		}
		if(i>=arr.length)
		{
			System.out.println("Element not found");
		}
}
}