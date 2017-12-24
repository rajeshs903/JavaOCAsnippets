package com.whizlabs.practise;

import java.util.Arrays;

public class ArrayIndexDemo1 {

	static int i=2;
	public static void main(String[] args) {
	int []a=new int[i];
	a[0]=3;
//	a[2]=5;	// compiles fine .. but Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
	System.out.println(a[0]);
	System.out.println("**********************");
	int b[][][]=new int[1][2][3];
	b[0][0][0]=1;
	b[0][0][1]=2;
	b[0][0][2]=3;
	b[0][1][0]=4;
	b[0][1][1]=5;
	b[0][1][2]=6;
	
	for(int c[][]:b)
		for(int d[]: c)
			for (int e:d)
				System.out.println(e);
	// below declaration is same as above array b[][][]
	int x[][][]=new int[][][]{{{1,2,3},{4,5,6}}};

	
	System.out.println("*************After Fill********");
/**
 * Arrays.fill method explanation
 */
	int ar[] = {2, 2, 1, 8, 3, 2, 2, 4, 2};

	// To fill complete array with a particular
	// value
	Arrays.fill(ar, 10); // works only with 1D array : F3 to see implementation.
	System.out.println("Array completely filled" +
			" with 10\n" + Arrays.toString(ar));
	
	for(int c[][]:b)
		for(int d[]: c)
		{
			Arrays.fill(d, 5);
			for (int e:d)
			{
				
				System.out.println(e);
			}
		}
	
	/**
	 * Arrays.deepEquals(obj, obj2) example
	 */
	int[] a1={2,-1,3,4};
	int[] a2={2,-1,3,4};
//	System.out.println(Arrays.deepEquals(a1,a2)); 
	//The method deepEquals(Object[], Object[]) in the type Arrays is not applicable for the arguments (int[], int[])
	
	/**
	 * array passing.. possible exceptions while casting example.
	 */

	/*
	System.out.println("**************** passing array for Size1 method**********");
	long[] longarray={2,-1,3,4};
	
	System.out.println(size1(a2)); // using 1D array of above example // compile and runs fine when you pass int[]
	System.out.println(size1(longarray));  // java.lang.ClassCastException: [J cannot be cast to [I
	*/
	}
		public static int size1(Object o)
		{
			return ((int[]) o).length;
		}
		
		
}
