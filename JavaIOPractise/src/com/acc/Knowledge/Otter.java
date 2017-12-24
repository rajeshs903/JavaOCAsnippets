package com.acc.Knowledge;

public class Otter {

	/**
	 * this snippet is used to have idea whether caller can see the assignments in called method,when using 
	 *  toy=new Toy(); and without using toy=new Toy();
	 * 
	 */
	private static void play(Toy toy)
	{
//	toy=new Toy();	//when in use gives output as false,since the reference is changed to new object here before assignment so value is intact in view of orginal caller(main method)
	toy.removeIce();
	}
	
	public static void main(String[] args) {
		Toy t=new Toy();
		Otter.play(t);
		System.out.println(t.containIce());
	}

}
class Toy{
	private boolean containsIce=false;
	public boolean containIce()
	{
		return containsIce;
	}
	public void removeIce()
	{
		this.containsIce=true;
	}
}