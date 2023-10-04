package com.cg.multipleInheritence;

interface Printable
{
	void print();
}

interface Showable
{
	void show();
}

class Pgm2 implements Printable,Showable
{
	public void print()
	{
		System.out.println("Hello");
	}
	public void show()
	{
		System.out.println("Welcome");
	}
}



public class MultipleInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pgm2 ob = new Pgm2();
		ob.print();
		ob.show();

	}

}
