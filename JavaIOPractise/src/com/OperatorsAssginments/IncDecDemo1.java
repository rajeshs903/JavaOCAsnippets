package com.OperatorsAssginments;

public class IncDecDemo1 {

	public static void main(String[] args) 
	{
		/**
		 * Case 1 
		
		
		int x=10;
		int y=++x ;  	// Valid 
		System.out.println(y);
		

		int x1=10;
		int y1=++10;  	// invalid  bcoz increment or dec operators will not be applicable for constants or values , it req variables
		System.out.println(y1);
		 
		 */
		
		/**
		 * Case 2 
		
		
		int x=10;
		int y=++(++x) ;  	// invalid bcoz after ++x , it will become as value then we get unexpected type ,  
		System.out.println(y);
		*/
		
	
		/**
		 * case 3 : FIANL variable
		 * 
		 
		final int x=10;
		x++;
		System.out.println(x);
		 *
		 */
		
		/**
		 * Case 4 : types for which , inc and dec operators are applicable
		 * 
		 * Except Boolean every type is applicable
		 * 
		 
		
		int x=10; 		// INT
		x++;
		System.out.println(x);
		
		char ch='a';	//CHAR
		ch++;
		System.out.println(ch); // b
		
		double d=10.5;	//double 
		d++;
		System.out.println(d);  //11.5
		
		float f=10.30f; //float
		f++;
		System.out.println(f); // 11.3
		
		boolean b= true;	//boolean  
		b++;
		System.out.println(b);
		
		*/
		
		/**
		 * case 5 : Arthamatic operations between any 2 variables will be followed by this below rule
		 * 
		 * 		Max(int , type of varialble1, type of variable 2)
		 * 		max(int ,byte ,byte)
		 * 		=int
		 * but we are tryin to add that result to byte c.. so we will get compile time error
		 * 
		 * 
		 
		byte a=10;
		byte b=20;
		byte c=a+b; // cannot convert from int to byte
		System.out.println(c);
		
		*/
		
		/**
		 * case 5.1 :
		 *			b=b+1 V/S b++ 
		
		byte b=10;
		b=(byte)(b+1); 	//without type casting , we will get compile time error, there is no internal typeCasting , we needed to add it 
		System.out.println(b);
		
		
		byte b1=10;
		b=b1++;		//there will be internal typeCasting ,we will not going to get compile time error
		System.out.println(b1);
		
		 */
		
		
		
		
		
		
		
		
	}

}
