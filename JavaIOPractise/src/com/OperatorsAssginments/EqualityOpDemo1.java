package com.OperatorsAssginments;

public class EqualityOpDemo1 {

	public static void main(String[] args)
	{
		/**
		 * Equality operators are applicable for every type including boolean and object types
		 *
		 * 
		System.out.println(1>3);
		System.out.println('a'==97.0);
		System.out.println(false==false);
		*
		*
		*/
		
		
		
		
		
		/**
		 * if both references pointing to same object address then == operator returns true
		 * else false
		 * 
		 * 
		
		Thread t1=new Thread();
		Thread t2=new Thread();
		Thread t3=t1;
		if(t1==t2)
		{
			System.out.println("t1 and t2 are pointing to same address");
		}
		else
		{
			System.out.println("t1 and t2 are not pointing to same address");
		}
		if(t1==t3)
		{
			System.out.println("t1 and t3 are pointing to same address");
		}
		else
		{
			System.out.println("t1 and t3 are not pointing to same address");
		}
		
		 */
		
		
		
		/***
		 * 
		 * 
		 * to compare two object types , there must be some relation in between those two types 
		 *  either child to parent type
		 *  or parent to child type
		 *  or same type 
		 * 
		 
		Thread t=new Thread();
		Object o=new Object();
		String s= new String("rajesh");
		
		System.out.println(t==o);
		System.out.println(s==o);
	//	System.out.println(t==s); //Incompatible operand types Thread and String
		*
		*
		*/
		
		
		
		
		/**
		 *  
		 * Difference between '== operator' V/S .equals() 
		 * 
		 * == for reference comparison 
		 * equals() for content comparison
		 * 
		 
		String s1=new String("rajesh");
		String s2=new String("rajesh");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		*
		*
		*/
		String s = null;
		System.out.println(s==null);
		
		
		
		
		
	}

}
