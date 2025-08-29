package com.codegnan.basic;

import java.util.Scanner;

public class SI {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       System.out.println("enter principle value : ");
	       int P=sc.nextInt();
	       System.out.println("Enter time in years : ");
	       int T=sc.nextInt();
	       System.out.println("Enter rate of interest : ");
	       float R=sc.nextFloat();
	       double Simpleint=P*T*R;
	       double Total=P+Simpleint;
	       System.out.println("Simple Interest is : "+Simpleint);
	       System.out.println("Total Amount is : "+Total);
	       sc.close();

	}

}
