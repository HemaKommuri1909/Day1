package com.codegnan.arrays;
import java.util.Scanner;
public class Rotate_Three {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[3];
		System.out.println("Enter the elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array is : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
		System.out.println("Left rotated array is : ");
		for(int i=0;i<arr.length;i++ ) {
			System.out.print(arr[i]+" ");
		}
		
		sc.close();
	}

}
