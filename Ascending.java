package com.codegnan.arrays;

import java.util.Scanner;

public class Ascending {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of tha array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array is");
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        //Bubble sort
        for(int i=0;i<arr.length-1;i++) {
        	for(int j=0;j<arr.length-i-1;j++) {
        	if(arr[j]>arr[j+1]) {
        		int temp=arr[j];
        		arr[j]=arr[j+1];
        		arr[j+1]=temp;
        	}
          }
        }
        System.out.println("Ascending order  is ");
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
        
        sc.close();
	}

}
