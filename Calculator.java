package com.codegnan.oop.overloading;

public class Calculator {
	int num1;
	int num2;
public Calculator(int num1,int num2) {
	this.num1=num1;
	this.num2=num2;
}
public int Addition() {
	int sum=num1+num2;
	return sum;
}

}
