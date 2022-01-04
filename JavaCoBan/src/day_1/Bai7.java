/*
 * (C) Copyright 2022. All Rights Reserved.
 *
 * @author DongTHD
 * @date Jan 4, 2022
*/
package day_1;

public class Bai7 {

	public static void main(String[] args) {
		methodOne();
		methodTwo();
		methodThree();
		methodFour();
		methodFive();
		methodSix();
		methodSeven();
		methodEight();

	}

	/*
	 * bieu thuc a +=b
	 */
	public static void methodOne() {
		int a = 1;
		int b = 2;
		a += b;
		System.out.println("bieu thuc a +=b");
		System.out.println("a da thay doi thanh:" + a);
		System.out.println("b da thay doi thanh:" + b);
		System.out.println("------------------------");
	}

	/*
	 * bieu thuc b -=a
	 */
	public static void methodTwo() {
		int a = 1;
		int b = 2;
		b -= a;
		System.out.println("bieu thuc b -= a");
		System.out.println("a da thay doi thanh:" + a);
		System.out.println("b da thay doi thanh:" + b);
		System.out.println("------------------------");
	}

	/*
	 * bieu thuc a *=b
	 */
	public static void methodThree() {
		int a = 1;
		int b = 2;
		a *= b;
		System.out.println("bieu thuc a *= b");
		System.out.println("a da thay doi thanh:" + a);
		System.out.println("b da thay doi thanh:" + b);
		System.out.println("------------------------");
	}

	/*
	 * bieu thuc b /=a
	 */
	public static void methodFour() {
		int a = 1;
		int b = 2;
		b /= a;
		System.out.println("bieu thuc b /= a");
		System.out.println("a da thay doi thanh:" + a);
		System.out.println("b da thay doi thanh:" + b);
		System.out.println("------------------------");
	}

	/*
	 * bieu thuc a++
	 */
	public static void methodFive() {
		int a = 1;
		a++;
		System.out.println("bieu thuc a++");
		System.out.println("a da thay doi thanh:" + a);
		System.out.println("------------------------");
	}

	/*
	 * bieu thuc b--
	 */
	public static void methodSix() {
		int b = 2;
		b--;
		System.out.println("bieu thuc b--");
		System.out.println("b da thay doi thanh:" + b);
		System.out.println("------------------------");
	}

	/*
	 * bieu thuc ++a
	 */
	public static void methodSeven() {
		int a = 1;
		++a;
		System.out.println("bieu thuc ++a");
		System.out.println("a da thay doi thanh:" + a);
		System.out.println("------------------------");
	}

	/*
	 * bieu thuc --b
	 */
	public static void methodEight() {
		int b = 2;
		--b;
		System.out.println("bieu thuc --b");
		System.out.println("b da thay doi thanh:" + b);
	}

}
