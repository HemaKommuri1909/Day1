package com.codegnan.arrays;
import java.util.Scanner;

public class Add_Mul {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sizes of row and column of array1 ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] arr1=new int[r][c];
		System.out.println("Enter the elements in array 1: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Elements in the arrray 1 are :");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		//arr2
		System.out.println("Enter sizes of row and column of array2 ");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		int[][] arr2=new int[r][c];
		System.out.println("Enter the elements in array 2: ");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("Elements in the arrray 2 are :");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}

		//sum of two arrays
		int[][] sum=new int[arr1.length][arr1[0].length];
		System.out.println("Sum of elements of arr1 and arr2 is ");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				sum[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print((sum[i][j])+" ");
			}
			System.out.println();
		}
		
		//product of two arrays
		System.out.println("product of elements of arr1 and arr2 is ");
		int[][] pro=new int[arr1.length][arr1[0].length];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				pro[i][j]=arr1[i][j]*arr2[i][j];
				System.out.print(pro[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
		
	}

}
