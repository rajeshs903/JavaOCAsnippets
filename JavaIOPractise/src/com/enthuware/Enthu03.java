package com.enthuware;

public class Enthu03 {
	public static void main(String[] args) {
StringBuilder sb=new StringBuilder();
sb.append("raj");
System.out.println(sb);

sb.delete(0, sb.length());
System.out.println(sb);

/*
System.out.println(null + true); //1  
		 System.out.println(true + null); //2   
		 System.out.println(null + null); //3 
		System.out.println('a' + 1 );
		System.out.println(4 + 1.0f); 
*/		/* float f = 0.0f;
		   
		      f = Float.valueOf("").floatValue();
		
		for(int i=0; i<3; i++){
	         System.out.print(args+" ");
	      }
	}*/
	}
}

interface I1 { }
interface I2 { }
class C1 implements I1 { }
class C2 implements I2 { }
class C3 extends C1 implements I2 { }
class C4 extends C3 implements I1, I2{}
