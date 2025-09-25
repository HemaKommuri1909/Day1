package com.codegnan.constructorexam;

public class Area_Main {

	public static void main(String[] args) {
			Area_Methods A1=new Area_Methods();
			A1.breadth=10;
			A1.height=5;
			A1.length=2;
			A1.Vol1();
			
			Area_Methods A2=new Area_Methods();
			A2.Vol2(5,3,2);
			
			Area_Methods A3=new Area_Methods();
			A3.breadth=15;
			A3.height=50;
			A3.length=20;
			System.out.println("Volume 3 : "+ A3.Vol3());
			
			Area_Methods A4=new Area_Methods();
			System.out.println("Volume 4 : "+ A4.Vol4(5,13,21));
			
			Area_Methods.Vol5();
			
			Area_Methods.Vol6(4,6,2);
			
			System.out.println("Volume 7 : "+ Area_Methods.Vol7());
			
			System.out.println("Volume 8 : "+ Area_Methods.Vol8(9,5,2));
			
			
		}


	}


