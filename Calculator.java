package com.codegnan.basic;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num : ");
		int num=sc.nextInt();
		for(int i=0;i<=10;i++) {
		String table=num+"x"+i+"="+num*i;
		System.out.println(table);
		}
		System.out.println();

	}

}
