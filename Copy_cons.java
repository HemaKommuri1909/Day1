package com.codegnan.constructorexam;

public class Copy_cons {
	String name;
	int roll_num;
    int marks;
    public Copy_cons(String n,int r,int m) {
    	this.name=n;
    	this.roll_num=r;
    	this.marks=m;
    }
    Copy_cons(Copy_cons x){
    	name=x.name;
    	roll_num=x.roll_num;
    	marks=x.marks;
    }
	

}
