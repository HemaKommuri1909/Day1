package com.codegnan.arrays;

import java.util.Scanner;

public class FirstLast_Equal {

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
			if(arr[0]==arr[n-1]) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
           sc.close();

	}

}
