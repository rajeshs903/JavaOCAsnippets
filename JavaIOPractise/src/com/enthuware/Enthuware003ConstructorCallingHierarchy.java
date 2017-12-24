package com.enthuware;
/**
 * enthuware.ocajp.i.v8.2.1355

 * @author Rajesh
 *
 */
public class Enthuware003ConstructorCallingHierarchy {

	public static void main(String[] args) {

		B b=new B(2,4);
		b=new B(2);
	}

}

class A {
	int i;

	public A(int x) {
		super();
		this.i = x;
	}
}

class B extends A {
	int j;
	B(int y ) { super(y*2 ); j = y; }

	public B(int x, int y) {
		super(x);
		this.j = y;
	}
}
