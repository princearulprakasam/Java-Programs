package com.perficient;
import java.util.Scanner;
public class LoopConceptsAndSorting {
	public static void main (String args[]) {
		int[] arr;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int noe=sc.nextInt();
		arr=new int[noe];
		System.out.printf("Enter the %d elements of the array : ",noe);
		for (int i=0;i<noe;i++)
		{
			arr[i]=sc.nextInt();
		}
			
		System.out.println("-------------------DISPLAYING ARRAY ELEMENTS-----------------");
		for (int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+"\t");
		}{
		for (int i=0; i<arr.length-1; i++)
		{
			for (int j=0; j<arr.length-1; j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
			}
				else {break;}
		}	
			System.out.println("\n------------------Array after sorting------------------- ");
			for (i=0;i<arr.length;i++)
				
				{
				System.out.print(arr[i]+"\t");
				}
			
		}
		
		System.out.println("\nInput the element to be searched :");
		int se=sc.nextInt();
		int i;
		for (i=0;i<arr.length;i++) {
			{ if(se==arr[i])
			{
				System.out.println(se + " Element found at location "+(i+1));
				break;
			}
					}
		}
		if (i==arr.length) {System.out.println(se+" Element not found");}
		}
		}
}
