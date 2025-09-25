package com.codegnan.oop.overloading;

import java.util.Scanner;

public class Employee_1Info extends Employee_1{
	double yr_salary;
	public Employee_1Info() {
		super("", "", 0);
	}
	public void Enter_EmployeeDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Name : ");
		name=sc.next();
		System.out.println("Enter Employee Designation : ");
		designation=sc.next();
		System.out.println("Enter Years of Experience : ");
		yr_experience=sc.nextInt();
		System.out.println("Enter salary per year : ");
		yr_salary=sc.nextInt();
		sc.close();
	    	
	}
	public void display_Details() {
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Designation : "+designation);
		System.out.println("Years of experience : "+yr_experience);
	}
	public void calculate_Salary() {
		double salary=yr_experience*yr_salary;
		System.out.println("Salary is : "+salary);
	}
   
}
