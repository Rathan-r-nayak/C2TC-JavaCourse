//Wrapper classes are used to use primitive data types as objects.


package com.cg.wrapperClass;

public class WrapperInteger {
	public static void main(String args[]) {
		
		
		Integer v1 = new Integer(10);  //old
		
		//new		
		Integer var = 20;  // Autoboxing: int to Integer
		int a = var;   // Unboxing: Integer to int
		printValues(var);
		
		
		
		Integer v2 = Integer.valueOf(30);
		System.out.println("v1="+v1+"\nv2="+v2);
	}
	
	public static void printValues(Integer val)
	{
		System.out.println("\nval="+val);
	}

}
