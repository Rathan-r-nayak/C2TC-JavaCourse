package com.cg.privateAccessModifier;



public class PrivateModifier {
	public static void main(String args[]) {
		Employee emp = new Employee();
		
		emp.display();
		
//		System.out.println(emp.name);    gives error bcz the name data member is private
	}

}
