package com.codegnan.arrays;

import java.util.Scanner;

public class Sumofarr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size=sc.nextInt();
		int[] numbers=new int[size];
		System.out.println("Enter numbers");
		for(int i=0;i<size;i++) {
			numbers[i]=sc.nextInt();
		}
		System.out.println("Elements in Arrays are");
		int sum=0,count=0;
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
			sum+=numbers[i];
			count++;
		}
		System.out.println();
		System.out.println("Sum of the elements in array is :"+sum);
		float avg=(float)sum/count;
		System.out.println("Average is :"+avg);
        sc.close();
	}

}
