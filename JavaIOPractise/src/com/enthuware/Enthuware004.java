package com.enthuware;

public class Enthuware004 {
	static int[] data = { 1, 2, 3, 4, 5 };
	static int x = 5;

	public static void main(String[] args) {

		/*
		 * for (int i : data) { if (i < 2) { continue; } System.out.print(i); if
		 * (i == 3) { ; } }
		 */

		/*
		 * boolean b = false; int i = 1; do{ i++ ; } while (b = !b);
		 * System.out.println( i );
		 */

		/*
		 * int ia[][] = { { 1, 2 }, null }; for (int i = 0; i < 2; i++) for (int
		 * j = 0; j < 2; j++) System.out.println(ia[i][j]); //Exception in
		 * thread "main" java.lang.NullPointerException
		 */

		/*
		 * int x = (x = 3) * 4; System.out.println(x);
		 */

		method(1);
		method(2);
		System.out.println(j);
		
	}

	static String j = "";

	public static void method(int i) {
		try {
			if (i == 2) {
				throw new Exception();
			}
			j += "1";
		} catch (Exception e) {
			j += "2";
			return;
		} finally {
			j += "3";
		}
		j += "4";
	}
}
