package com.codegnan.arrays;

import java.util.Scanner;

public class TwoDarr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sizes of a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int[][] arr=new int[a][b];
		System.out.println("Enter the elements");
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.println("Enter "+i+" "+j);
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Elements in an array are : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
		

	}

}
