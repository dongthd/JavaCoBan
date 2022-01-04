/*
 * (C) Copyright 2022. All Rights Reserved.
 *
 * @author DongTHD
 * @date Jan 4, 2022
*/
package day_1;

public class Bai8 {

	public static void main(String[] args) {

		boolean a = true && false;
		boolean b = (3 > 100) || (25 % 5 == 0);
		boolean c = a && b;
		boolean d = a || !b;
		boolean e = a || !b && c;
		boolean f = c && d && e;
		boolean g = (a == true) || (b == true) || (c == false) || (d == false);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}
}
