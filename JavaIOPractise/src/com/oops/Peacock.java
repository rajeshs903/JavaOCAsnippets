package com.oops;

 class Bird {
	public String getName() {
		return "Unknown";
	}

	public void displayInformation() {
		System.out.println("BIRD:The bird name is: " + getName());
	}
	public void displyBird()
	{
		System.out.println("this is bird specific method");
		
	}
}

public class Peacock extends Bird {
	public String getName() {
		return "Peacock";
	}
	public void displayInformation() {
		System.out.println("PEACOCK:The bird name is: " + getName());
	}
	public void displayPeacock()
	{
		System.out.println("this is peacock specific method");
	}
	public static void main(String[] args) {
		System.out.println("********MAIN**********");
		System.out.println("********Peacock p=new Peacock();**********");

		Peacock p=new Peacock();
		p.displayInformation(); //getName() of sub class will be called everytime as it was overriden in subclass
		p.displayPeacock();
		p.displyBird();			// Access to both class methods since ref variable is Peacock(subclass)
		
		
		System.out.println("*******Bird bird = new Peacock();***********");

		Bird bird = new Peacock();
		bird.displayInformation();
	//	bird.displyPeacock(); //The method displyPeacock() is undefined for the type Bird.. which means bird loses its access to sub class when it was referred by super class.
		bird.displyBird();		
					//  when super class ref is specified, there is no access to sub class specific methods
		System.out.println("*******Bird b=new Bird();***********");
		
		Bird b=new Bird();		// only Bird class methods.. not even overriden methods will be considered
		b.displayInformation();
		b.displyBird();
		
	}
}