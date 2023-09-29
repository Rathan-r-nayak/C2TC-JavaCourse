package com.cg.abstraction;

public abstract class Shape {
	double dim1,dim2;
	
	//Constructor
	Shape(double x,double y)
	{
	dim1=x;
	dim2=y;
	}
	
	//abstract method
	abstract double area();
}
