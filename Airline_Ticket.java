/*Java Programming Question: Airline Ticket Pricing System

◆ Problem Statement: Write a Java program to calculate the final price of an airline ticket based on the following conditions:

The base price of the ticket is ₹5000.

The final price is affected by:

Passenger Type:
############################################
"child": 50% discount

"senior": 20% discount

"adult". No discount

Any other input: show error and terminate.

Booking Time:
#########################################
"early": 10% discount

"normal": No change

"last-minute": 20% extra charge

Membership Status:

If the passenger is a member, they get an additional 5% discount on the final price. Display the final ticket price after all applicable discounts/surcharges*/

package com.codegnan.control;

import java.util.Scanner;

public class Airline_Ticket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int base=5000;
		System.out.println("Enter passenger type : ");
		String Passenger=sc.next();
		
		double price=0;
			
			if(Passenger.equals("child")) {
				 price=base-base*0.5;
				System.out.println("You have to pay : "+price);	
			}
			
			else{
				if(Passenger.equals("senior")) {
				 price=base-base*0.2;
				System.out.println("You have to pay : "+price);	
			}
				else{
					
				if(Passenger.equals("adult")) {
				   price=base;
				   System.out.println("You have to pay : "+price);	
			    }
				else {
					System.out.println("show error and terminate.");
					}
				}
			}
			
			
			System.out.println("Enter early type : ");
			String booking_time=sc.next();
			
			
		  if(booking_time.equals("early")) {
				price-=price*0.1;
				System.out.println("You have to pay : "+price);	
			}
			
		 else{
			 if(booking_time.equals("normal")) {
				 //price=base;
				System.out.println("You have to pay : "+price);	
			}
			 else{
				 
			 if(booking_time.equals("lastminute")) {
	           	 price+=price*0.2;
	           	System.out.println("You have to pay : "+price);	
	         }
		  }
			  
			   
		}
		  
		  System.out.println("If You are the member pls type member :");
		  String mem=sc.next();
		  
	      if(mem.equals("yes")) {
		    price-=price*0.05;
		    System.out.println("You have to pay : "+price);
		   }
	      else {
	    	  System.out.println("Sorry you have no discount"+price);
	      }
	      sc.close();

	}

}
