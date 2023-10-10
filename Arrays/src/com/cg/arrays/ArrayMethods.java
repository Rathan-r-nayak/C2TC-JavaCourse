package com.cg.arrays;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1,2,3,4,5,6,7,8,9,10 };
		int arr2[] = { 1,2,3,4,5,6,7,8,9,10 };
		int arr3[] = { 12,11,3,41,15,6,7,68,19,10 };
		
		
		System.out.println(Arrays.compare(arr, arr2));
		
		System.out.println("Integer Array: "+ Arrays.toString( Arrays.copyOf(arr, 15)));
		
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));

	}

}
