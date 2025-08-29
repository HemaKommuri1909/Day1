package com.codegnan.basic;
import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius : ");
		float r=sc.nextFloat();
		double Area=(3.14)*r*r;
		System.out.println("Area of the circle is :"+Area);

	}

}
