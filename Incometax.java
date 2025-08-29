package com.codegnan.basic;
import java.util.Scanner;
public class Incometax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sal :");
		int sal=sc.nextInt();
		double dis=(sal<300000)?0.05:(sal>300000 && sal<=1000000)?0.1:0.15;
		dis=(sal>2000000)?dis*0.14:dis;
		double tax=sal*dis;
		System.out.println("Tax is : "+tax);
		
	}

}

