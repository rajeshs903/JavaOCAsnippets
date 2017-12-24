package com.enthuware;

public class StaticBlockExe {
static float f=10;
static int i1=11;

	{System.out.println(" instance Main");}
	public static void main(String[] args)  {
	Bb b=new Bb();
	
	}
	static {System.out.println(" satic main class");}
}

class Aa
{
	{System.out.println(" instance Aa super");}
	Aa() 
	{
		System.out.println(" constructor A super");
	}
	static {System.out.println(" static A super");}
	
}
class Bb extends Aa
{
	{System.out.println(" instance Bb sub class");}
	Bb() 
	{
		System.out.println(" constructor B sub class");
	}
	static {System.out.println(" static B sub class");}
}
/**
 *  satic main class
 satic A
 satic B
 instance Aa
 constructor A
 instance Bb
 constructor B
 
 first load super class in STATIC , INSTANCE ,constructor in orders .then comes down to subclass
 */



