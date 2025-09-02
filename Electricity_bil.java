
/* Write a Java program to calculate the monthly electricity bill based on the number of units consumed, applying the following slab rates:

Units Consumed                    Rate per Unit

0-100                                ₹1.50

101-200                              ₹2.00

201-300                              ₹3.00

Above 300                            ₹5.00

If the total bill exceeds ₹1000, apply a 10% surcharge.

If the user is a senior citizen, apply an additional 5% discount on the total.*/


package com.codegnan.control;

import java.util.Scanner;

public class Electricity_bil {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter units :");
		int units=sc.nextInt();
		double bill=0;
	    if(units>0 && units<=100) {
	    	bill=units*1.50;
	    	System.out.println("your bill is : "+bill);
	    }
	    else {
	    	if(units>100 && units<=200) {
		    	bill=100*1.50+(units-100)*2.00;
		    	System.out.println("your bill is : "+bill);
		    }
	    	else {
	    		if(units>201 && units<=300) {
	    	    	bill=100*1.50+100*2.00+(units-200)*3.00;
	    	    	System.out.println("your bill is : "+bill);
	    	    }
	    		else {
	    			if(units>300) {
	    		    	bill=100*1.50+100*2.00+100*3.00+(units-300)*5.00;
	    		    	System.out.println("your bill is : "+bill);
	    		    }
	    		}
	    	}
	    }
	    if(bill>=1000) {
	    	bill+=bill*0.1;
	    	System.out.println("your bill is above 1000 so you have surcharge 0f 10% and you have to pay :"+bill);
	    }
	    
	    System.out.println("are you senior citizen");
	    String c=sc.next();
	    
	    if(c.equals("yes")) {
	    	bill-=bill*0.05;
	    	System.out.println("your are a senior citizen so you have 5% discount and your bill is :"+bill);
	    }
	    else {
	    	System.out.println("Sorry only for senior citizens have discount");
	    }
	    sc.close();
	}

}
