/*
 * (C) Copyright 2022. All Rights Reserved.
 *
 * @author DongTHD
 * @date Jan 4, 2022
*/
package day_1;

import java.util.Scanner;

public class Bai2 {

	/*
	 * nhap so thuc tu ban phim, cho ra ket qua va * 2
	 */
	public static void main(String[] args) {

		System.out.print("Xin moi nhap 1 so thuc tu ban phim : ");

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		double a = scanner.nextDouble();
		double result = a * 2;

		System.out.println("Ket qua sau khi * 2 la : " + result);

	}
}
