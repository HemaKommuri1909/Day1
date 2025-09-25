package com.codegnan.constructorexam;

public class Area_Methods {
int length;
int breadth;
int height;
//-----------------------Instance Methods--------------------

//without return and para
public void Vol1() {
	System.out.println("Volume 1 : "+ length*breadth*height);
}

//without return and with para
public void Vol2(int length,int breadth,int height) {
	System.out.println("Volume 2 : "+ length*breadth*height);
}

//with return and without para
public int Vol3() {
	return length*breadth*height;
}

//with return and para
public int Vol4(int length,int breadth,int height) {
	return length*breadth*height;
}

//-----------------------Static Methods--------------------

//without return and para
public static void Vol5() {
	int length=2,breadth=8,height=7;	
	System.out.println("Volume 5 : "+ length*breadth*height);
}

//without return and with para
public static void Vol6(int length,int breadth,int height) {
	System.out.println("Volume 6 : "+ length*breadth*height);
}

//with return and without para
public static int Vol7() {
	int length=3,breadth=5,height=7;
	return length*breadth*height;
}

//with return and para
public static int Vol8(int length,int breadth,int height) {
	return length*breadth*height;
}
//	public static void main(String[] args) {
//		Area_Methods A1=new Area_Methods();
//		A1.breadth=10;
//		A1.height=5;
//		A1.length=2;
//		A1.Vol1();
//		
//		Area_Methods A2=new Area_Methods();
//		A2.Vol2(5,3,2);
//		
//		Area_Methods A3=new Area_Methods();
//		A3.breadth=15;
//		A3.height=50;
//		A3.length=20;
//		System.out.println("Volume 3 : "+ A3.Vol3());
//		
//		Area_Methods A4=new Area_Methods();
//		System.out.println("Volume 4 : "+ A4.Vol4(5,13,21));
//		
//		Vol5();
//		
//		Vol6(4,6,2);
//		
//		System.out.println("Volume 7 : "+ Vol7());
//		
//		System.out.println("Volume 8 : "+ Vol8(9,5,2));
//		
//		
//	}

}
