/*
 * (C) Copyright 2022. All Rights Reserved.
 *
 * @author DongTHD
 * @date Jan 4, 2022
*/
package day_1;

import java.util.Scanner;

public class Bai6 {

	/*
	 * giai phuong trinh bac hai, voi a b c là 3 so thap phan nhap tu ban phim
	 *
	 */
	public static void main(String[] args) {

		double a, b, c;
		double delta;
		double x, x1, x2;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap vao so a:");
		a = scanner.nextDouble();

		System.out.print("Nhap vao so b:");
		b = scanner.nextDouble();

		System.out.print("Nhap vao so c:");
		c = scanner.nextDouble();

		if (a == 0) {
			if (b != 0) {
				x = -c / b;
				System.out.println("Phuong trinh co mot nghiem duy nhat x = " + x);
			} else {
				if (c != 0) {
					System.out.println("Phuong trinh vo nghiem!");
				} else {
					System.out.println("Phuong trinh co vo so nghiem!");
				}
			}
		} else {
			delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem!");
			} else if (delta == 0) {
				x = -b / (2 * a);
				System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + x);
			} else if (delta > 0) {
				x1 = ((-b - Math.sqrt(delta)) / (2 * a));
				x2 = ((-b + Math.sqrt(delta)) / (2 * a));
				System.out.println("Phuong trinh co 2 nghiem phan biet x1 = " + x1 + " va x2 = " + x2);
			}
		}
	}
}
