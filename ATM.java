package com.codegnan.basic;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Show total amount");
		double available=sc.nextDouble();
		System.out.println("Enter how much you want to debit");
		int amt=sc.nextInt();
		if(amt<=available) {
			System.out.println(amt+" Succesfully debited");
		}
		else {
			System.out.println("Insufficient amount");
		}
		System.out.println("Remaining balance is : "+(available-amt));
        sc.close();

	}

}
