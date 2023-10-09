package com.cg.trycatchBlock;

public class TryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10,b=0,res;
		
		
		try {
			res =a/b;
			System.out.println(res);
		}
		catch(Exception e) {
			System.out.println("Exception :"+e);
		}
		

	}

}
