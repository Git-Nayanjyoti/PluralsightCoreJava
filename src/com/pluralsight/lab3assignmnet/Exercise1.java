package com.pluralsight.lab3assignmnet;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1 {
	static class StringTockenizer {
		public static void main(String[] args) {
			int num;
			int sum = 0;
			Scanner Sc = new Scanner(System.in);
			System.out.print("Enter a line of integers: ");
			String stg = Sc.nextLine();
			StringTokenizer ST = new StringTokenizer(stg, " ");
			while(ST.hasMoreTokens()) {
				String temp = ST.nextToken();
				num = Integer.parseInt(temp);
				System.out.println(num);
				sum += num;
			}
			System.out.println("Sum of the integers is: " + sum);

		}
	}
}
