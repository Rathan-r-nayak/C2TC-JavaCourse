//The private access modifier is accessible only within class


package com.cg.privateAccessModifier;

class Employee {
	private String name;
	
	Employee()
	{
		this.name="Rathan R Nayak";
	}
	
	void display()
	{
		System.out.println("Employee name is "+this.name);
	}
}
