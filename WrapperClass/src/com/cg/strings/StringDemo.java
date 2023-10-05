package com.cg.strings;

public class StringDemo {
	public static void main(String args[])
	{
		String s1 = "Rathan";
		String s2 = "Rathan";
		
		String s3 = new String("rat");
		String s4 = new String("rat");
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		
		System.out.println(s1 == s3);
		
		System.out.println("s1.equals(s2)= "+s1.equals(s2));
		System.out.println("s1.equals(s3)= "+s1.equals(s3));
		
	}

}
