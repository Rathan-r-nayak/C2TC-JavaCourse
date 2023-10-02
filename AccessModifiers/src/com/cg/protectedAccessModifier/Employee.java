/*The protected access modifier is accessible within package and outside the
package but through inheritance only.*/


package com.cg.protectedAccessModifier;

public class Employee {
	String name;
	
	Employee()
	{
		this.name="Rathan R Nayak";
	}
	
	protected void display()
	{
		System.out.println("Employee name is "+this.name);
	}
}
