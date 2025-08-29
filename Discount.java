package com.codegnan.basic;
import java.util.Scanner;
public class Discount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your amount : ");
		double amt=sc.nextInt();
		double dis=(amt>=100)?0.2:(amt>=50)?0.1:amt;
		double dismny=amt*dis;
		double bill=amt-dismny;
		System.out.println("Discount money is : "+dismny);
		System.out.println("After discount we have to pay money is : "+bill);

	}

}
