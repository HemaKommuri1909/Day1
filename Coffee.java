package com.codegnan.constructorexam;

public class Coffee {
String type;
String size;
Boolean isSugar;

public Coffee(String type,String size,Boolean isSugar) {
	this.type=type;
	this.size=size;
	this.isSugar=isSugar;
}
public void displayOrder() {
	System.out.println("Enter your type of coffee : "+this.type);
	System.out.println("Enter your size of coffee : "+this.size);
	System.out.println("Enter you want sugar or not :"+this.isSugar);
}
}
