package com.whizlabs.practise;

public class InheritanceDemo1 {

	public static void main(String[] args) {
		System.out.println(args.length);
	((SuperC)new SubSubC()).method();	
Double d=8.08;
System.out.println(d instanceof Object);
	}

}
class SuperC
{
	public void method()
	{
		System.out.println("super class");
	}
}
class SubC extends SuperC
{
	public void method()
	{
		System.out.println("sub class");
	}
}
class SubSubC extends SubC
{
	public void method()
	{
		System.out.println("SubSub class");
	}
}