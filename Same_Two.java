/*
 Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.

 commonEnd([1, 2, 3], [7, 3])? true

commonEnd([1, 2, 3], [7, [7, 3, 2])? false

commonEnd([1, 2, 3], [1, 3])? true
 */
package com.codegnan.arrays;

import java.util.Scanner;

public class Same_Two {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array1 : ");
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
		
		System.out.println("Enter the size of an array2 : ");
		int n2=sc.nextInt();
		int[] arr2=new int[n2];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n2;i++) {
			arr2[i]=sc.nextInt();
		}
		System.out.println("Array is : ");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		String res="";
		for(int i=0;i<n;i++) {
		if(arr[0]==arr2[0] || arr[n-1]==arr2[n2-1]) {
			res="true";
		}
		else {
			res="false";
		}
		}
		System.out.println(res);
		sc.close();
	}

}
