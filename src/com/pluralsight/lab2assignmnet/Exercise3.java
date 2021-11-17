package com.pluralsight.lab2assignmnet;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
	int reversenum(int num) {
		int rev = 0;
		while (num > 0) {
			rev = num * 10 + num % 10;
			num = num / 10;
		}
		return rev;
	}

	int[] getSorted(int[] arr) {
		int[] reverse = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			reverse[i] = reversenum(arr[i]);
		}
		Arrays.sort(reverse);
		return reverse;
	}

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int size = Sc.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Enter the string object at index" + i + ":");
			array[i] = Sc.nextInt();
		}
		Exercise3 obj = new Exercise3();
		System.out.println("The sorted array is:" + Arrays.toString(obj.getSorted(array)));
	}
}
