package com.codegnan.control;

import java.util.Scanner;

public class Rev_num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int rev=0,temp=n;
		while(n!=0) {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(temp<0) {
			//System.out.println(-rev);
		    System.out.println("Reversed number is : "+(~rev+1));
		}
        sc.close();
	}

}
