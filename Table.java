package com.codegnan.control;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num : ");
		int num=sc.nextInt();
		for(int i=0;i<=20;i++) {
		String table=num+"x"+i+"="+num*i;
		System.out.println(table);
		}
	//	System.out.println();
		sc.close();

	}

}
