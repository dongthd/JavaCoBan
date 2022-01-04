/*
 * (C) Copyright 2022. All Rights Reserved.
 *
 * @author DongTHD
 * @date Jan 4, 2022
*/
package day_1;

import java.util.Scanner;

public class Bai1 {

	/*
	 * nhap so nguyen tu ban phim
	 */
	public static void main(String[] args) {

		System.out.print("Xin moi nhap 1 so nguyen tu ban phim : ");

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();

		System.out.println("So nguyen vua nhap la : " + a);

	}
}
