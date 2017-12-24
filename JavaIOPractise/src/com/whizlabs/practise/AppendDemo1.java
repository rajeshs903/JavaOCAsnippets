package com.whizlabs.practise;

public class AppendDemo1 {
/**
 * Sb.append() method 
 * @param args
 */
	public static void main(String[] args) {

		char[] chars={'1','Z','0','-','8','1'};
		StringBuilder sb=new StringBuilder();
		System.out.println(chars.length-1);
		sb.append(chars, 0, chars.length-1);
		sb.append('0');
		sb.append("8");
		System.out.println(sb);
		System.out.println("*************");
		StringBuilder sb1=new StringBuilder();
		System.out.println(chars.length-1);
		sb1.append(chars, 0, chars.length-1);
		sb1.append("08");
		sb1.setLength(4);
		System.out.println(sb1);
		sb1.insert(5, "10");	// java.lang.StringIndexOutOfBoundsException: String index out of range: 5
		System.out.println(sb1);
		
		
	}

}
