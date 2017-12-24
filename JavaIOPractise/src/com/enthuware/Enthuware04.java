package com.enthuware;

public class Enthuware04 {

	public static void main(String[] args) {
	
		parseFloat("0x.1");
	}

	public static float parseFloat(String s){
		   float f = 0.0f;
		   try{
		      f = Float.valueOf(s).floatValue();
		 
		      return f ;
		   }
		   catch(NumberFormatException nfe){
		      System.out.println("Invalid input " + s);
		     
		      return f;
		   }
		   finally { System.out.println("finally "+s+" is now "+f);  }
		
		}
}

