package com.whizlabs.practise;

import java.time.LocalDate;

public class OperatorsDemo1 {

	static int f=90;
	public static void main(String[] args) {
	
	/*	int y=5;
		if(false && y++ ==5)
			System.out.println(y);
		else if (true || --y == 4)
			System.out.println(y);
		else(y==5) System.out.println(y);
		*/
		for(int j=0,k=5;j<k;k--);
			for(int j=0;j++ < 3;);
				for(int i=0;i<5;i++,System.out.println(i+".Hi"));
				
				/*int x,y=10;
				System.out.println(x);*/
				/*Long x=4;
				System.out.println(Integer.MAX_VALUE);*/
				LocalDate d=LocalDate.of(2010, 10, 10);
				
				/*Integer g=10;
				Double gg=10;
				if(g==gg) System.out.println("AAAA");*/
				char v='C';
				v++;
				System.out.println(v);
				int f1=90;
				
				System.out.println(f1+f);
				int f=78;
				System.out.format("%d0",f);
				
				
	}

}
