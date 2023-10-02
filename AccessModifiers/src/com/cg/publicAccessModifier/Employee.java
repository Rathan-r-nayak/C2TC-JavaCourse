/*The public access modifier is accessible everywhere. It has the widest scope
among all other modifiers.*/

package com.cg.publicAccessModifier;



public class Employee {
	String name;
	
	Employee()
	{
		this.name="Rathan R Nayak";
	}
	
	public void display()
	{
		System.out.println("Employee name is "+this.name);
	}
}
