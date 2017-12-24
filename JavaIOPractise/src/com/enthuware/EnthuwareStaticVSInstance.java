package com.enthuware;

import java.util.ArrayList;
import java.util.List;

public class EnthuwareStaticVSInstance {

	static final String s = null;

	// static {s=null;}
	public static void main(String[] args) {

		EnthuwareStaticVSInstance e = new EnthuwareStaticVSInstance();
		Integer i = Integer.parseInt("0");
		Integer j = i;
		i--;
		i++;
		System.out.println((i == j));
		System.out.println(s);
		List s1 = new ArrayList();
		s1.add("a");
		s1.add("b");
		s1.add("c");
		s1.add("a");
		System.out.println(s1.remove("a") + " " + s1.remove("x"));
	}

}