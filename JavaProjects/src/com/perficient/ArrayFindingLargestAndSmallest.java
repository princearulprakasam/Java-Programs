package com.perficient;
import java.util.*; 
public class ArrayFindingLargestAndSmallest {
public static void main (String args[])
{
	Scanner sc=new Scanner (System.in);
	int arr[];
	System.out.println("Input the number of elements in the array:");
	int noe=sc.nextInt();
	arr=new int[noe];
	System.out.println("Input the " +noe+ " values in the array:");
	for (int i=0; i<arr.length;i++) {
		 arr[i]=sc.nextInt();
	}
	int large=arr[0];
	int small=arr[0];
	for (int i=0; i<arr.length;i++) {
		if(arr[i]>large) {large=arr[i];}
		if(arr[i]<small) {small=arr[i];}
	}
	System.out.println("Largest element="+large+"\nSmallest element="+small);
}
}