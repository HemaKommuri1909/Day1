package com.codegnan.basic;
import java.util.Scanner;

public class Taxiride {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter kilometers :");
		int km=sc.nextInt();
		double a=50,b=a+(km-2)*15,c=a+(8*15)+(km-10)*10,d=c*0.95;
		double mny=(km<=2)?a:(km<=10)?b:(km<=20)?c:d;
        System.out.println("You have to pay for the ride is : "+mny);
	}

}