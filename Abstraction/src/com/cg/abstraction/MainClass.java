package com.cg.abstraction;

public class MainClass {
	public static void main(String args[])
	{
	//Shape a=new Shape(10,10); // error, AreaPgm is a abstract class.
		
		
	Rectangle r=new Rectangle(10,5);
	System.out.println("Area="+r.area());
	
	Triangle t=new Triangle(10,8);
	System.out.println("Area="+t.area());
	
	
//	Shape ar;
//	ar=obj;
//	System.out.println("Area="+ar.area());
	}

}
