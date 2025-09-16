/*
 Given an array of integer , return the sum of first 2 elements in the array.
  If the array length is less than 2, just sum up the elements that exist,
   return 0 if array length is 0.
   1,2,3 ----3
   5,5 ----10
   8,2,1,4 ----10

 */
package com.codegnan.arrays;

import java.util.Scanner;

public class Sum_Two {

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
		int sum=0;
		if(arr.length<=0) {
			sum+=0;
		}
		else {
		for(int i=0;i<2;i++) {
			sum+=arr[i];
		}
		}
		System.out.println("Sum of first 2 elements is : "+sum);
		sc.close();
	}

}
