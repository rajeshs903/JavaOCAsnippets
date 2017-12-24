package com.acc.ExceptionHandling;
class LimpException extends Exception{}
public class HurtException extends LimpException{
public void run() {
	try{
		split();
	}catch (HurtException e) {
		System.out.println("hurt 1");
	}catch (LimpException e) {
		System.out.println("Limp 1");
	}
	catch (RuntimeException e) {
		System.out.println("runtime");
	}catch (Exception e) {
		System.out.println("exception");
	}
}
		private void split() throws LimpException 
			{
				
			}
		
}

