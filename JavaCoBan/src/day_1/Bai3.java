/*
 * (C) Copyright 2022. All Rights Reserved.
 *
 * @author DongTHD
 * @date Jan 4, 2022
*/
package day_1;

import java.util.Scanner;

public class Bai3 {

	/*
	 * nhap so nguyen tu ban phim, thong bao so chan le
	 */
	public static void main(String[] args) {

		System.out.print("Xin moi nhap 1 so nguyen tu ban phim : ");

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();

		if (a % 2 == 0) {
			System.out.println("Day la so chan");
		} else {
			System.out.println("Day la so le");
		}

	}
}
