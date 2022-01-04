/*
 * (C) Copyright 2022. All Rights Reserved.
 *
 * @author DongTHD
 * @date Jan 4, 2022
*/
package day_1;

import java.util.Scanner;

public class Bai5 {

	/*
	 * giai phuong trinh bac nhat (ax + b = 0), voi a b là 2 so thap phan nhap tu
	 * ban phim
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		double a;
		double b;
		double nghiemPT;

		System.out.println("Nhap vao so a: ");
		a = scanner.nextDouble();

		System.out.println("Nhap vao so b: ");
		b = scanner.nextDouble();

		if (a == 0) {

			if (b == 0) {

				System.out.println("Phuong trinh nay co vo so nghiem");

			} else {

				System.out.println("Phuong trinh vo nghiem");

			}
		} else {

			nghiemPT = (-b / a);
			System.out.println("Phuong trinh co nghiem x = " + nghiemPT);

		}

	}

}
