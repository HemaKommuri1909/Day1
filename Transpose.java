package com.codegnan.arrays;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] arr=new int[r][c];
		System.out.println("Enter the elements ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Array is ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Transposed Array is ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				//arr[i][j]=arr[j][i];
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
