package com.codegnan.control;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int rev=0,temp=num;
		while(num!=0) {
			int r=num%10;
			rev=rev*10+r;
			num/=10;
		}
		System.out.println("Reversed number is : "+rev);
		if(rev==temp) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		sc.close();

	}

}
