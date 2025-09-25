package com.codegnan.oop.overloading;

public class Manager extends Employee{
	public Manager() {
		
	}
public Manager(double salary) {
	this.salary=salary;
}
public void calculateSalary(double bonus) {
	System.out.println("Manager Details");
	System.out.println("Salary is : "+(salary+bonus));
}

public void calculateSalary(double bonus,double allowance) {
	System.out.println("Salary is : "+(salary+bonus+allowance));
}

}
