package com.cg.abstraction;

public class Rectangle extends Shape 
{
	//Constructor
	Rectangle(double a,double b)
	{
	super(a,b);
	}
	
	
	double area()
	{
	System.out.println("Rectangle Area");
	return dim1*dim2;
	}

}
