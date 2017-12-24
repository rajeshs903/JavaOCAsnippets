package com.acc.ExceptionHandling;

public class EnthuwareExFinally {
/**
 * A break without a label breaks the current loop (i.e. no iterations any more) and a break with a label tries to pass the control to the given label.
'Tries to' means that if the break is in a try block and the try block has a finally clause associated with it then it will be executed.

 * @param args
 */
	public static void main(String[] args) {
		int i = 0;
	      loop :         // 1
	      {
	         System.out.println("Loop Lable line");
	         try{
	            for (  ;  true ;  i++ ){
	               if( i >5) break loop;       // 2
	            }
	         }
	         catch(Exception e){
	            System.out.println("Exception in loop.");
	         }
	         finally{
	        	 i=300;
	            System.out.println("In Finally");      // 3 
	         }
	      }
System.out.println(i);

	}

}
