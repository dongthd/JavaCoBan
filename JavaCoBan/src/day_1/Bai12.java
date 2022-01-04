/*
 * (C) Copyright 2022. All Rights Reserved.
 *
 * @author DongTHD
 * @date Jan 4, 2022
*/
package day_1;

import java.util.Scanner;

public class Bai12 {

	/*
	 * Nhap vao 2 so nguyen, luu vao 2 bien a va b, dao gia tri cua 2 bien nay roi
	 * xuat gia tri cua chung ra man hinh console
	 *
	 */
	public static void main(String[] args) {

		// Ex1();
		Ex2();
	}

	/*
	 * Cach 1 : dung bien tam 'c'
	 *
	 */
	public static void Ex1() {
		int a;
		int b;
		int c;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap vao so a: ");
		a = scanner.nextInt();

		System.out.print("Nhap vao so b: ");
		b = scanner.nextInt();

		// hoan doi voi bien c trung gian
		c = a;
		a = b;
		b = c;

		System.out.println("===== Ket qua sau khi hoan doi =====");
		System.out.println("a = " + a + "\nb = " + b);
	}

	/*
	 * Cach 2 : khong dung bien tam
	 *
	 */
	public static void Ex2() {
		int a;
		int b;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap vao so a: ");
		a = scanner.nextInt();

		System.out.print("Nhap vao so b: ");
		b = scanner.nextInt();

		// su dung thuat toan hoan doi voi cong tru
		a = a - b;
		b = a + b;
		a = b - a;

		System.out.println("===== Ket qua sau khi hoan doi =====");
		System.out.println("a = " + a + "\nb = " + b);
	}

}
