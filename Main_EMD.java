package com.codegnan.oop.overloading;

public class Main_EMD {

	public static void main(String[] args) {
		Employee_Overload E=new Manager_Overl("Hema",50000.0,"HR");
		E.Details();
		Employee_Overload E1=new Developer_Overload("Bhagya",60000.0,"Java");
		E1.Details();
		

	}

}
