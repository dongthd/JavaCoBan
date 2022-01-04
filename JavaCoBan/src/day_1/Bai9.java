/*
 * (C) Copyright 2022. All Rights Reserved.
 *
 * @author DongTHD
 * @date Jan 4, 2022
*/
package day_1;

import java.util.Scanner;

public class Bai9 {

	/*
	 * nhap vao 1 so tu nhien tu 1->5, sau do in ra tieng anh cua so do
	 */
	public static void main(String[] args) {

		// Ex1();
		// Ex2();
		//Ex3();
		Ex4();

	}

	/*
	 * Ex1 : Dung cac lenh if lien tiep nhau
	 */
	public static void Ex1() {

		System.out.print("Xin moi nhap 1 so tu nhien 1 -> 5: ");

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		if (a == 1) {
			System.out.println("One");
		}
		if (a == 2) {
			System.out.println("Two");
		}
		if (a == 3) {
			System.out.println("Three");
		}
		if (a == 4) {
			System.out.println("Four");
		}
		if (a == 5) {
			System.out.println("Five");
		}

	}

	/*
	 * Ex2 : Dung cac lenh if ket hop voi cac else-if lien tiep
	 */
	public static void Ex2() {

		System.out.print("Xin moi nhap 1 so tu nhien 1 -> 5: ");

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		if (a == 1) {
			System.out.println("One");
		} else if (a == 2) {
			System.out.println("Two");
		} else if (a == 3) {
			System.out.println("Three");
		} else if (a == 4) {
			System.out.println("Four");
		} else if (a == 5) {
			System.out.println("Five");
		} else {
			System.out.println("Khong nam trong khoang 1-5");
		}
	}

	/*
	 * Ex3 : Dung cac lenh if long nhau
	 */
	public static void Ex3() {

		System.out.print("Xin moi nhap 1 so tu nhien 1 -> 5: ");

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		if (a > 0 && a <= 5) {
			if (a == 1) {
				System.out.println("One");
			}
			if (a == 2) {
				System.out.println("Two");
			}
			if (a == 3) {
				System.out.println("Three");
			}
			if (a == 4) {
				System.out.println("Four");
			}
			if (a == 5) {
				System.out.println("Five");
			}
		} else {
			System.out.println("Khong nam trong khoang 1-5");
		}
	}

	/*
	 * Ex4 : Dung switch case
	 */
	public static void Ex4() {

		System.out.print("Xin moi nhap 1 so tu nhien 1 -> 5: ");

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		switch (a) {
		case 1:
			System.out.println("One");
			break;

		case 2:
			System.out.println("Two");
			break;

		case 3:
			System.out.println("Three");
			break;

		case 4:
			System.out.println("Four");
			break;

		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("khong nam trong khoang 1-5");
			break;
		}
	}
}
