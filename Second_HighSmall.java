package com.codegnan.arrays;

import java.util.Scanner;

public class Second_HighSmall {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array is : ");
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        for(int i=0;i<n;i++) {
        	for(int j=i+1;j<n;j++) {
        		if(arr[i]>arr[j]) {
        			int temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        }
      
        int sec_small=arr[1];
        int sec_high=arr[n-2];
        int[] res= {sec_small,sec_high};
        System.out.println("Second smallest and second highest element in this array is :");
        for(int r:res) {
        	System.out.print(r+" ");
        }
        sc.close();
	}

}
