package com.codegnan.basic;
import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks=s.nextInt();
		String res=(marks>=90)?"O":(marks>=80)?"S":(marks>70)?"A":(marks>60)?"B":(marks>50)?"C":(marks>40)?"D":"F";
		System.out.println("Your grade is :"+res);

	}

}