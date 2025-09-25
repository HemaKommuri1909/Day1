package com.codegnan.constructorexam;

public class Basic_Method {
String name;
int age;
public void Vote() {
	System.out.println("Your Name is : "+name);
	System.out.println("Your Age is : "+age);
}
	public static void main(String[] args) {
		Basic_Method b=new Basic_Method();
		b.name="Hema";
		b.age=21;
		b.Vote();
	}

}
