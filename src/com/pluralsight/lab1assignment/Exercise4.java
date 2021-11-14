package com.pluralsight.lab1assignment;

import java.util.Scanner;

public class Exercise4 {

		public static void main(String[] args) {
			int n;
			int p;
			@SuppressWarnings("resource")
			Scanner Sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
			n = Sc.nextInt();
			for (int i = 2; i < n; i++) {
				p = 0;
				for (int j = 2; j < i; j++) {
					if (i % j == 0)
						p = 1;
				}
				if (p == 0) 
					System.out.println(i);
			}
		}
	
}
