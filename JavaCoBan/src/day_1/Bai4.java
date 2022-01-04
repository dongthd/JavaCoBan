/*
 * (C) Copyright 2022. All Rights Reserved.
 *
 * @author DongTHD
 * @date Jan 4, 2022
*/
package day_1;

import java.util.Scanner;

public class Bai4 {

	/*
	 * nhap vao ban kinh cua hinh tron, tinh chu vi va dien tich
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Xin moi nhap ban kinh r cua hinh tron : ");

		double banKinh = scanner.nextDouble();

		double pi = 3.14;
		double chuVi = banKinh * 2 * pi;
		double dienTich = banKinh * banKinh * pi;

		System.out.println("Chu vi hinh tron la : " + chuVi);

		System.out.println("Dien tich hinh tron la :" + dienTich);

	}
}
