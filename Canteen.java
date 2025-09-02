/*Java Programming Question: Advanced Canteen System
Question:
Problem Statement:
You are tasked with developing an Canteen System for a small canteen that handles ordering and billing.
The system should present a menu with options for ordering tea, coffee, and samosas. 
The user can place orders, view their bill, and check out. The program should:
Display the canteen menu showing the price of each item (tea, coffee, samosas).
Allow the user to order items by selecting the item number (1 for Tea, 2 for Coffee, 3 for Samosa) and entering the quantity.
View the bill that shows:
The total cost of each item ordered.
The subtotal (sum of the cost of all ordered items).
A 5% tax on the subtotal.
The grand total, which includes the subtotal and tax.
Allow the user to checkout and exit the system.
The program should continuously display the menu of options until the user chooses to exit.
 The switch-case statement should be used to implement the logic for handling different user choices.
Requirements:
Use the switch-case statement for handling different options such as:
Viewing the menu.
Ordering items.
Viewing the bill.
Exiting the system.
Each item in the menu (Tea, Coffee, Samosa) should have a fixed price:
Tea: ₹10
Coffee: ₹15
Samosa: ₹20
The tax rate should be set to 5% of the subtotal.
Item quantity validation:
If the user enters an invalid quantity (less than or equal to 0), display an error message.
If the user selects an invalid item number, display an error message.
If the user selects an option not available in the menu (i.e., any number other than 1, 2, 3, or 4), show an error message.
Once the user selects "Checkout and Exit", print a thank you message and exit the system.
Testcase -1 Order 2 Samosas and View Bill
=========================================
||=========== CANTEEN MENU ===========||
1. View Menu
2. Order Items
3. View Bill
4. Checkout and Exit
Enter your choice: 1
--- MENU ---
1. Tea     - ₹10
2. Coffee  - ₹15
3. Samosa  - ₹20
||=========== CANTEEN MENU ===========||
1. View Menu
2. Order Items
3. View Bill
4. Checkout and Exit
Enter your choice: 2
Enter item number to order (1-3): 3
Enter quantity: 2
2 Samosa(s) added.
||=========== CANTEEN MENU ===========||
1. View Menu
2. Order Items
3. View Bill
4. Checkout and Exit
Enter your choice: 3
--- BILL ---
Samosa x2 = ₹40
Subtotal = ₹40
Tax (5%) = ₹2.0
Total = ₹42.0
Test Case 2: Order 3 Teas and View Bill
—-----------------------------------------------
||=========== CANTEEN MENU ===========||
1. View Menu
2. Order Items
3. View Bill
4. Checkout and Exit
Enter your choice: 2
Enter item number to order (1-3): 1
Enter quantity: 3
3 Tea(s) added.
||=========== CANTEEN MENU ===========||
1. View Menu
2. Order Items
3. View Bill
4. Checkout and Exit
Enter your choice: 3
--- BILL ---
Tea x3 = ₹30
Subtotal = ₹30
Tax (5%) = ₹1.5
Total = ₹31.5
Test Case 3: Order 2 Coffees + 1 Tea and View Bill
—---------------------------------------------------------------
||=========== CANTEEN MENU ===========||
1. View Menu
2. Order Items
3. View Bill
4. Checkout and Exit
Enter your choice: 2
Enter item number to order (1-3): 2
Enter quantity: 2
2 Coffee(s) added.
||=========== CANTEEN MENU ===========||
1. View Menu
2. Order Items
3. View Bill
4. Checkout and Exit
Enter your choice: 2
Enter item number to order (1-3): 1
Enter quantity: 1
1 Tea(s) added.
||=========== CANTEEN MENU ===========||
1. View Menu
2. Order Items
3. View Bill
4. Checkout and Exit
Enter your choice: 3
--- BILL ---
Tea x1 = ₹10
Coffee x2 = ₹30
Subtotal = ₹40
Tax (5%) = ₹2.0
Total = ₹42.0
Test Case 4: Invalid Quantity (0) and Exit
—-----------------------------------------------------
||=========== CANTEEN MENU ===========||
1. View Menu
2. Order Items
3. View Bill
4. Checkout and Exit
Enter your choice: 2
Enter item number to order (1-3): 1
Enter quantity: 0
Quantity must be greater than 0.
||=========== CANTEEN MENU ===========||
1. View Menu
2. Order Items
3. View Bill
4. Checkout and Exit
Enter your choice: 4
Thank you! Exiting system*/

package com.codegnan.control;
import java.util.Scanner;
public class Canteen {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int teaprice=10,coffeeprice=15,samosaprice=20;
		int teaqty=0,coffeeqty=0,samosaqty=0;
		int choice;
		do {
			System.out.println("||=========== CANTEEN MENU ===========||");
			System.out.println("1. View Menu");
			System.out.println("2. Order Items");
			System.out.println("3. View Bill");
			System.out.println("4. Checkout and Exit");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("--- MENU ---\r\n"
						+ "1. Tea     - ₹10\r\n"
						+ "2. Coffee  - ₹15\r\n"
						+ "3. Samosa  - ₹20");
				break;
			case 2:	
				System.out.println("=========List of Order Items==========");
				System.out.println("Enter item number to order (1-3):");
				int item=sc.nextInt();
				System.out.println("Enter quantity of the item :");
				int quantity=sc.nextInt();
				if (quantity <= 0) {
                    System.out.println("Quantity must be greater than 0.");
                    break;
                }
				switch(item) {
				case 1:
					teaqty+=quantity;
					System.out.println(teaqty+"tea(s) added");
					break;
				case 2:
					coffeeqty+=quantity;
					System.out.println(coffeeqty+"coffee(s) added");
					break;
				case 3:
					samosaqty+=quantity;
					System.out.println(samosaqty+"samosa(s) added");
					break;
				default:
					System.out.println("Invalid items it is in b/w 1-3");
					break;
				}
				break;
			case 3:
				System.out.println("=========== View Bill============");
				int subtotal=0;
				if(teaqty>0) {
					int cost = teaqty * teaprice;
                    System.out.println("Tea x" + teaqty + " = ₹" + cost);
                    subtotal += cost;
                }
                if (coffeeqty > 0) {
                    int cost = coffeeqty * coffeeprice;
                    System.out.println("Coffee x" + coffeeqty + " = ₹" + cost);
                    subtotal += cost;
                }
                if (samosaqty > 0) {
                    int cost = samosaqty * samosaprice;
                    System.out.println("Samosa x" + samosaqty + " = ₹" + cost);
                    subtotal += cost;
                }
				
		    	System.out.println("Subtotal is :"+subtotal);
				double tax=subtotal*0.05;
				double total=subtotal+tax;	
				System.out.println("Tax is :"+tax);
				System.out.println("Total is :"+total);		
				break;
			case 4:
				System.out.println("Thank you! Exiting system");
				break;
			default:
				System.out.println("Invalid choice number");
				break;			
			}

	}while(choice!=4);
  sc.close();
}
}
