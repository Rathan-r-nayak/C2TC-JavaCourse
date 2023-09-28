package MethodOverloading;

public class Addition {
	//method 1
	public int addition(int a, int b) {
		return a+b;
	}
	
	//method 2
	public int addition(int a, int b, int c) {
		return a+b+c;
	}
	
	
	//method 3
	public float addition(float a, float b) {
		return a+b;
	}
	
	//method 4
	public float addition(float a, float b, float c) {
		return a+b+c;
	}
	
	//method 5
	public float addition(float a, float b, int c) {
		return a+b+c;
	}
}
//Method overloading in Java is a feature that allows you to define multiple methods with the same name in a class,
//but with different parameter lists. These methods can have different numbers or types of parameters. When you call an 
//overloaded method, the Java compiler determines which method to invoke based on the number and types of arguments passed to it.
//Method overloading is a form of compile-time polymorphism.