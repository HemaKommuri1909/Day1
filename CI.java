package com.codegnan.basic;

import java.util.Scanner;

public class CI {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principle value : ");
	    int P=sc.nextInt();
	    System.out.println("Enter time in years : ");
	    int t=sc.nextInt();
        System.out.println("Enter rate of interest : ");
        float R=sc.nextFloat();
        System.out.println("Enter no.of tyms interest is compounded in a year :");
        int n=sc.nextInt();
        double Total=P*Math.pow((1+(R/(n*100))), n*t);
        double Compoundint=Total-P;
        System.out.println("Total Amount is : "+Total);
        System.out.println("Compound Interest is : "+Compoundint);
        sc.close();

	}

}
