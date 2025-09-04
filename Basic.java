package com.codegnan.arrays;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int[] b=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++) {
			b[i]=sc.nextInt();
		}
		System.out.print("Elements in an array are : ");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		sc.close();
}
}