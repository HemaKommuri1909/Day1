package com.codegnan.constructorexam;

public class Basic {
String name;
int age;
public Basic(String n,int a) {
	this.name=n;
	this.age=a;
}
	public static void main(String[] args) {
		Basic b=new Basic("Hema",21);
        System.out.println(b.name+" "+b.age);
	}

}
