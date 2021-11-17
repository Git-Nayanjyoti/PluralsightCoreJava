package com.pluralsight.lab2assignmnet;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
	String sortStrings(String[] arr) {
		Arrays.sort(arr);
		return Arrays.toString(arr);

	}

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = Sc.nextInt();
		String[] array = new String[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the string object at index"+ i + ":");
			array[i] = Sc.next(); 
		}
		Exercise2 obj = new Exercise2();
		System.out.println("The sorted array in Alphabetical object is" + obj.sortStrings(array));
		
	}
}
