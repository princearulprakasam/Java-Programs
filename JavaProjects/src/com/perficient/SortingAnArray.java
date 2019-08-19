package com.perficient;
import java.util.*;
public class SortingAnArray {
public static void main(String args[]) {
	int[] arr;
	Scanner sc=new Scanner(System.in);
	System.out.println("Input the number of elements of the array:");
	int noe=sc.nextInt();
	arr=new int[noe];
	System.out.println("Input the "+noe+" elements of the array:");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	boolean flag=false;
	for(int i=0;i<arr.length-1;i++) {
		System.out.println((i+1)+" Passes ");
		for (int j=0; j<arr.length-1;j++) {
			if(arr[j]<arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		if(flag)flag=false;
		else break;
	}
	System.out.println("\n-----------SORTED ARRAY IS--------------");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+"\t");
			}
		}
}
