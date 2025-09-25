package com.codegnan.constructorexam;

public class Cop_main {

	public static void main(String[] args) {
			Copy_cons c=new Copy_cons("Hema",1614,78);
			System.out.print(c.name+" "+c.roll_num+" "+c.marks);
			
			Copy_cons c1=new Copy_cons(c);
			System.out.print(c1.name+" "+c1.roll_num+" "+c1.marks);


	}

}
