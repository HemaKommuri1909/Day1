/*Sum of elements in a row and sum of elements in a column */


package com.codegnan.arrays;

import java.util.Scanner;

public class Sum_RowCol {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sizes of row and column ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] arr=new int[r][c];
		System.out.println("Enter the elements : ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Elements in the arrray are :");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int r_sum=0,c_sum=0;
		//for row
		for(int i=0;i<1;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println("Elements in row "+i+" and column "+j+" is "+arr[i][j]);
				r_sum+=arr[i][j];
			}
		}
		System.out.println(r_sum);
		
		//for each rows sums
				for(int i=0;i<1;i++) {
					for(int j=0;j<arr.length;j++) {
						System.out.println("Elements in row "+i+" and column "+j+" is "+arr[i][j]);
						r_sum+=arr[i][j];
					}
				}
				System.out.println(r_sum);
		
		//for column
		for(int i=0;i<1;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println("Elements in row "+j+" and column "+i+" is "+arr[j][i]);
				c_sum+=arr[j][i];
			}
		}
		System.out.println(c_sum);
       sc.close();
	}

}
