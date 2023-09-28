package MethodOverloading;

public class MainClass {
	public static void main(String args[])
	{
		Addition ob1=new Addition();
		
		System.out.println("5 + 6 = "+ob1.addition(5, 6));    //method 1
		
		System.out.println("5 + 7 + 88 = "+ob1.addition(5,7,88));   //method 2
		
		
		System.out.println("5.5 + 7.5 = "+ob1.addition(5.5f,7.5f));   //method 3
		
		System.out.println("5.5 + 7.5 + 99.9f = "+ob1.addition(5.5f,7.5f,99.9f));  //method 4
		
		System.out.println("5.5 + 7.5 + 99 = "+ob1.addition(5.5f,7.5f,99));//method 5
		
	}
}
