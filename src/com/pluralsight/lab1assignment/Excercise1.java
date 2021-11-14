package com.pluralsight.lab1assignment;

import java.lang.Math;
import java.util.Scanner;

public class Excercise1 {
	public int sumofcube(int n) {
		int sum = 0;
		int num = n;
		int digit = 0;
		while(num>0) {
			digit = num % 10;
			num = num / 10;
			sum += Math.pow(digit, 3); 
		}
		return sum;
	}
	public static void main(String[] args) {
		int number;
		@SuppressWarnings("resource")
		Scanner Sc = new Scanner(System.in);
		Excercise1 obj = new Excercise1();
		System.out.println("Enter an n digit Integer: ");
		number = Sc.nextInt();
		System.out.println("The sum of cube of the digits is : " + obj.sumofcube(number));
	}

}
