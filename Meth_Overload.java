package com.codegnan.constructorexam;

public class Meth_Overload {

	public void test() {
		System.out.println("No parameters");
	}
	public void test(int a) {
		System.out.println("a : "+a);
	}
	public void test(int a,int b) {
		System.out.println("a = "+a+" and "+"b = "+b);
	}
	public void test(double a) {
		System.out.println("a = "+a);
	}
	
	public static void main(String[] args) {
		Meth_Overload m=new Meth_Overload();
		m.test();
		m.test(10);
		m.test(2,3);
		m.test(7.5);

	}

}
