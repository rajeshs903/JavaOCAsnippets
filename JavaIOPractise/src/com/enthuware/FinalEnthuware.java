package com.enthuware;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinalEnthuware {

	int i1;
	static int i2;

	public void method1() {
		int i;
		i = this.i2;
	}

	void probe(Object x) {
		System.out.println("In Object");
	}

	void probe(Number x) {
		System.out.println("In Number");
	}

	void probe(Integer x) {
		System.out.println("In Integer");
	}

	void probe(Long x) {
		System.out.println("In Long");
	}

	public static void main(String[] argss) {
		float a = 10;
		new FinalEnthuware().probe(a);
		List<String> s1 = new ArrayList();
		s1.add("a");
		s1.add("b");
		s1.add("c");
		s1.add("a");
		Object[] s=(s1.toArray());
		for (Object strr:s)
			System.out.print(strr+",");
		s1.add("x");
		
		System.out.println(s1);
		System.out.println("********");

		int arr[]=new int[]{1,2,3};
		List<Integer> l1=new ArrayList<>();
		for (int a1:arr)
			System.out.print(a1+" ");
				
			List ll2=Arrays.asList(arr);
			System.out.println(ll2);
			 System.out.println(System.getProperty("javac.version"));
		
	}

}
