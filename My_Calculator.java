package com.codegnan.oop.overloading;

import java.util.Scanner;

public class My_Calculator extends Calculator {

	My_Calculator(){
		super(0,0);
	}
	public void Enter_numbers() {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter num1 : ");
		num1=sc.nextInt();
		//System.out.println("Enter num2 : ");
		num2=sc.nextInt();
		sc.close();
	}
	
	public int Product() {
		int product=num1*num2;
		return product;
	}
	
	public void display() {
		System.out.println(super.Addition());
		System.out.println(Product());
	}

}
