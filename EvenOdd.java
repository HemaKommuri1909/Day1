package com.codegnan.basic;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int num=sc.nextInt();
		int num1=sc.nextInt();
		String res=(num%2==0)?"Even":"odd";
		System.out.println(res);
		String result=num>0?"Positive":"Negative";
		System.out.println(result);
		String result1=num>num1?"Greater is " +num:"Greater is "+num1;
		System.out.println(result1);
		int marks=sc.nextInt();
		String result2=marks>35?"pass":"Fail";
		System.out.println(result2);
		String result3=(num%5==0)&&(num%3==0)?"Divisible by 3 and 5":"not Divisible by 3 and 5";
		System.out.println(result3);
		
	}

}
