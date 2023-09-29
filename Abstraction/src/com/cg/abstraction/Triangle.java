package com.cg.abstraction;

public class Triangle extends Shape 
{
	
	//Constructor
	Triangle(double x,double y)
	{
		super(x,y);
	}
	
	
	double area()
	{
		System.out.println("Traingle Area");
		return dim1*dim2/2;
	}

}
