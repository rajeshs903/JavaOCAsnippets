package com.enthuware;

import java.util.ArrayList;
import java.util.List;

public class Xyz {

	public static void main(String[] args) {
		System.out.println("hello world");
		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(3);
		ints.add(4);
		ints.add(2, 3);
		System.out.println(ints);
		System.out.println(Integer.max(ints.get(3),32));
//		ints.removeIf(e -> e < 3);
		System.out.println(ints);
	}
}
