package com.codegnan.oop.overloading;

public class Child_super extends Parent_super {
	int x=200;
	public Child_super() {
		super();
		System.out.println("Child constructor");
	}
	public void display() {
		super.display();
		System.out.println("Child X : "+x);
		System.out.println("Parent a : "+ (super.a));
	}
	

}
