package com.codegnan.arrays;

import java.util.Scanner;

public class Three_follows_Two {
	
	public static void Test(int[][] num) {
		//System.out.println("Enter num1 and num2 ");
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				if(num[i][j]==3) {
					if(j>0 && num[i][j-1]==2){
					num[i][j]=0;
					}
					if(i>0 && num[i-1][j]==2) {
						num[i][j]=0;
					}
				}
			}
		}
		System.out.println("Modified Array is :");
		for(int i=0;i<num.length;i++) {
        	for(int j=0;j<num[i].length;j++) {
        		System.out.print(num[i][j]+" ");
        	}
        	System.out.println();
        }
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sizes of r and c ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] arr=new int[r][c];
		System.out.println("Enter the elements ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
        System.out.println("Elements in the array is ");
        for(int i=0;i<arr.length;i++) {
        	for(int j=0;j<arr[i].length;j++) {
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
       Test(arr);
        sc.close();
	}

}
