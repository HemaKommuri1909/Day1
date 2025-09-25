package com.codegnan.oop.overloading;

public class Developer_Overload extends Employee_Overload{
	String plang;
public Developer_Overload(String name,double salary,String plang) {
	this.name=name;
	this.salary=salary;
	this.plang=plang;
}

public void Details() {
	System.out.println("Developer Details ");
	System.out.println("Name : "+name);
	System.out.println("Salary : "+salary);
	System.out.println("Programming Language : "+plang);
}
}
