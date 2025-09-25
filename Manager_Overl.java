package com.codegnan.oop.overloading;

public class Manager_Overl extends Employee_Overload {
String department;
public Manager_Overl(String name,double salary,String department) {
this.name=name;
this.salary=salary;
this.department=department;
}
public void Details() {
	System.out.println("Manager Details");
	System.out.println("Name : "+name);
	System.out.println("Salary : "+salary);
	System.out.println("Department : "+department);
}
}
