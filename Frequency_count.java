package com.codegnan.arrays;

import java.util.Scanner;

public class Frequency_count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the elements ");
		for(int i=0;i<size;i++) {
				 arr[i]=sc.nextInt();
			}
		
        System.out.println("Elements in the array is ");
        for(int i=0;i<arr.length;i++) {
        		System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        boolean[] check=new boolean[arr.length];
        System.out.println("Repeated elements are :");
        
        for(int i=0;i<arr.length;i++) {
        	if(check[i]) {
        		continue;
        	}
        	int count=1;
        	for(int j=i+1;j<arr.length;j++) {
        		if(arr[j]==arr[i]) {
        			count++;
        			check[j]=true;
        		}
        	}
        	System.out.println(arr[i]+" = "+count+" tymes");
        }
		
        sc.close();
	}

}
