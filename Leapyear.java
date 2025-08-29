package com.codegnan.basic;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year");
		int yr=sc.nextInt();
		String res=(yr%4==0 && yr%100!=0)||(yr%400==0)?"It is a leap year":"Not a leap year";
		System.out.println(res);
	}

}
