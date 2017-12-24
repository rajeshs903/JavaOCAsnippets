package com.enthuware;

import java.util.*;

/*interface I1{
	   int VALUE = 1;
	static void m1(){System.out.println("default I1 with value"+VALUE);}
	}
	interface I2{
	   int VALUE = 2;
	  default void m1(){System.out.println("default I2 with value"+VALUE);}
	}
*/
public class Enthuware03 implements  I1,I2 {

	/*  int x = 5;
      int getX()
      { return x; }
      
      public void looper(){
         
          while( (x = getX()) != 0 ){
              for(int m = 10; m>=0; m--){
                  x = m;
              }
          }
	 }*/
	
	
	public static void main(String[] args) {

		
		
		
		/*I1 i1 = new Enthuware03();
			I1.m1();
		
		Enthuware03 tc = new Enthuware03();
	      ( (I2) tc).m1();
	      tc.m1();
	      System.out.println(( (I1) tc).VALUE);
		*/
		
		/*	int var = 20, i=0;
	  completeBreak:    do{
		  ForBreak:  for (int x=0;x<3;x++)
		  {
			  { if(i==22) System.out.println("here i is 22"+i);}
			  while(true){
				   System.out.println(i);
	         if( i++ > var) break;
	         }
		  }
	      }while(i<var--);
	      System.out.println(var);*/
	      
	      
		/*Enthuware03 e=new Enthuware03();
		e.looper();
		System.out.println(e.x);*/
		
		
	/*	Integer i = new Integer(42);
		Long ln = new Long(42);
		Double d = new Double(42.0);
		System.out.println(i.equals(d));
		System.out.println(ln.equals(d));
		System.out.println(d.equals(i));
		System.out.println(i.equals(42));
		*/
		
		/*
		List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("mrx");
        String s = sb.toString();
        list.add(s);
        System.out.println(s.getClass());
        System.out.println(list.getClass());	
	*/
        /*int x = 10;
		do{
		 x--;
		
		}while(x<10);
		 System.out.println(x);*/
		
		/*
		Object o = null;
		Collection c = new ArrayList<>();
		c.add("A");
		c.add("B");
		System.out.println(c);
		int[][] ia = {{1,2},{3,4}};
		for (final int a:ia[0])
		{
			System.out.println(a);
		}*/
		
		
		/*
		   int s = 5;
		   int y=s++;
		   System.out.println(y);
		   System.out.println(s+ " originally..");
		        int z= s+s  +  mx(s++)/++s;
		        System.out.println(z); 
*/
	
	}


   /* static int mx(int s){
    	System.out.println(s+ " passed");
        for(int i=0; i<3; i++){
            s = s + i;
        }
        System.out.println(s+ " in method");
        return s;
    }*/

}
	
