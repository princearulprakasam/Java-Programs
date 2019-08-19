package com.perficient;
import java.util.*;
public class TwoDimensionalArray {
public static void main (String args[]) {
	int[] arr[]=new int[3][3];
	Scanner sc=new Scanner(System.in);
	System.out.println("Input the 9 elements of the array");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	System.out.println("------------DISPLAYING THE ARRAY------------");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.println(arr[i][j]+"\t");
		}
		System.out.print("\n");
		}
	int jag_arr[][]=new int[4][];
	jag_arr[0]=new int[4];
	jag_arr[1]=new int[2];
	jag_arr[2]=new int[3];
	jag_arr[3]=new int[1];
	for(int i=0;i<jag_arr.length;i++) {
		for(int j=0;j<jag_arr[i].length;j++) {
			jag_arr[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<jag_arr.length;i++) {
		for(int j=0;j<jag_arr[i].length;j++) {
			System.out.print(jag_arr[i][j]+"\t");
		}
		System.out.print("\n");
	}
}
}