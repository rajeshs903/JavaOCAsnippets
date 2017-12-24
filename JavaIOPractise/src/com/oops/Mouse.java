package com.oops;

class Rodent {
	protected int tailLength = 4;

	public void getRodentDetails() {
		System.out.println("RODENT CLASS [parentTail=" + tailLength + "]"+getName());
	}
	/**
	 * regardless the call getName() (instance method), when you override it in subclass once , it will always executed the subclass implentation
	 * and when it comes to tailLength (instance variable) it will not get override but they will be hidden .. when you call in child class, child class value is appear and when you call in super class super class values displayed
	 * this is a noticeable difference when it comes to polymorphism
	 * @return
	 */
	public String getName()
	{
		return "SUPER CLASS /RODENT PARENT and"+tailLength;
	}
}

public class Mouse extends Rodent {
	protected int tailLength = 8;

	public void getMouseDetails() {
		System.out.println("MOUSE CLASS [tail=" + tailLength + ",parentTail="
				+ super.tailLength + "]"+"  getName="+getName());
	}
	
	
	public String getName()
	{
		return "SUB CLASS /MOUSE CHILD with "+tailLength;
	}
	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		mouse.getRodentDetails();
		mouse.getMouseDetails();
		System.out.println("\n ******************************** \n");
		
		Rodent r1=new Mouse();
		r1.getRodentDetails();
		
		
		

	}
}
