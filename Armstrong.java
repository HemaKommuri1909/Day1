package com.codegnan.control;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int arm=0,count=0,original=num;
		int temp=num;
		while(temp!=0) {
			temp/=10;
			count++;
			}
		//temp=num;
		while(num!=0) {
			int r=num%10;
			arm+=Math.pow(r,count);
//			int pow=1;
//			for(int i=0;i<count;i++) {
//				pow*=r;
//			}
//			arm+=pow;
			num/=10;	
			}
        System.out.println(arm);
        if(arm==original) {
        	System.out.println(original+" is an armstrong number");
        }
        else {
        	System.out.println(original+" not an armstrong number");
        }
        sc.close();
	}

}
