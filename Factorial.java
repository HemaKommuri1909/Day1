package com.codegnan.control;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int f=1;
		for(int i=n;i>0;i--) {
			f*=i;
		}
		System.out.println(f);
		sc.close();

	}

}
