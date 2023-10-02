/*If you don't use any modifier, it is treated as default by default. The default
modifier is accessible only within package.*/


package com.cg.defaultAccessModifier;

class Employee {
	String name;
	
	Employee()
	{
		this.name="Rathan R Nayak";
	}
	
	void display()
	{
		System.out.println("Employee name is "+this.name);
	}

}
