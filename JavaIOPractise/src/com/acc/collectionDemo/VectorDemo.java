package com.acc.collectionDemo;

import java.util.*;

import javax.swing.plaf.synth.SynthStyle;
public class VectorDemo {

	public static void main(String[] args) 
	{
		Vector v=new Vector();
/*		v.addElement(1);
		System.out.println(v.indexOf(1));
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		v.addElement(5);
		v.addElement(6);
		v.addElement(7);
		v.addElement(8);
		v.addElement(9);
		v.addElement(10);
		v.addElement(11);
*///	System.out.println(v.indexOf(10));
		
		for(int i=0;i<v.capacity();i++)
		{
			v.addElement(i);
		}
		
		
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());

	}

}
