package com.pluralsight.practice;

public class EnumPractice {
	/*
	 *
	 * You can NEVER invoke an enum constructor directly. The enum constructor is
	 * invoked automatically, with the arguments you define after the constant
	 * value. For example, PENNY(1) invokes the Coinn constructor that takes an int,
	 * passing the int literal 1 to the constructor. (Behind the scenes, of course,
	 * you can imagine that PENNY is also passed to the constructor, but we don't
	 * have to know—or care—about the details.)
	 *
	 */

	enum Coinn {
		PENNY(1), NICKEL(5), DIME(10), QUARTER(25);

		private final int value;

		private Coinn(int value) {
			this.value = value;
		}

		public int value() {
			return value;
		} 
	}

	public static void main(String[] args) {

		Coinn coin = Coinn.DIME;

		int value = coin.value();
		System.out.println(value);

	}

}
