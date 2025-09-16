/*
 Given an array of integer , return true if 6 appears as either the first or last element in the array.
The array will be length 1 or more.
[6,1,2]---true
 */
package com.codegnan.arrays;

import java.util.Scanner;

public class Six_Present {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
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
			if(arr[0]==6 || arr[n-1]==6) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
           sc.close();
	}

}
