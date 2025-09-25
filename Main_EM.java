package com.codegnan.oop.overloading;

public class Main_EM {

	public static void main(String[] args) {
		Employee e=new Employee("Hema",50000.0);
        e.calculateSalary();
        
        Manager m=new Manager(10000);
        m.calculateSalary();
        m.calculateSalary(3000);
        m.calculateSalary(5000,2000);
        
	}
    
}
