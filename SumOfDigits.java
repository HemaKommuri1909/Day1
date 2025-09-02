package com.codegnan.control;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		int sum=0,count=0;
		while(num!=0) {
			int r=num%10;
			sum+=r;
			num/=10;
			count++;
		}
		System.out.println("Sum of digits in given number is : "+sum);
		System.out.println("Count is : "+count);
        sc.close();
	}

}
