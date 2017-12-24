package com.whizlabs.practise;

public class Whiz1
{
	/**
	* Example for static blocks and instace block and constructor
	* 
	* Order :
	* 
	* Parent class Static blocks/variables in order (only once in one run)
	* Child class Static blocks/variables in order (only once in one run)
	* 
	* ** After creating object ***
	* 
	* Parent class Instance blocks/variables in order (once for each one object creation i.e new Obj())
	* Child class Instance blocks/variables in order (once for each one object creation i.e new Obj())
	* 
	* 
	* 
	*/
		public static void main(String args[])
		{
			Person p=new Manager();
			Double d1=0.0/0.0;
			System.out.println(d1);

			System.out.println(d1.isNaN());
		System.out.println(d1.isInfinite());
		
			
			
		}
}
class Person{
	int a=4;
	static int b=1;
	Person()
	{
		System.out.println("parent Constructor with value "+this.a+" and Static value "+this.b);
	}
	static {System.out.println("Static Block Parent");}
	{		System.out.println("Instace Block Parent");}
}
class Manager extends Person
{
	static int b=13;
	int a=8;
	Manager()
	{ 
		System.out.println("Child Constructor with value "+this.a+" and Static value "+this.b);
	}
	static {System.out.println("Static Block Child");}
	{	System.out.println("Instace Block Child");}
}