package com.codegnan.constructorexam;

public class Cons_Chainging {
 int id;
 String name;
 String Department;
 public Cons_Chainging() {
	 this(0,"Unknown");
	 System.out.println("Default constructor");
 }
 public Cons_Chainging(int id,String name) {
	 this(id,name,"unknown");
	 System.out.println("Two parameters constructor");
 }
 public Cons_Chainging(int id,String name,String Department) {
	 this.id=id;
	 this.name=name;
	 this.Department=Department;
	 System.out.println("Three parameters constructor");
 }
	public void DisplayInfo() {
		System.out.println("Employee id "+this.id);
		System.out.println("Employee name "+this.name);
		System.out.println("Employee Department "+this.Department);
	}
}
