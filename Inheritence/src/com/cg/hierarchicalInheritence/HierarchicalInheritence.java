package com.cg.hierarchicalInheritence;

public class HierarchicalInheritence {
	public static void main(String args[])
	{
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.eat();
		d.makeSound();
		
		System.out.println("-------------------");
		
		c.eat();
		c.makeSound();
	}
}
