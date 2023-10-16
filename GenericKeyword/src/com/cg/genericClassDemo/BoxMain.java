package com.cg.genericClassDemo;

public class BoxMain {

	public static void main(String[] args) {
		Box<String> ob = new Box<>("Rathan");
		System.out.println(ob.getData());
		
		Box<Integer> ob1 = new Box<>(11);
		System.out.println(ob1.getData());

	}

}
