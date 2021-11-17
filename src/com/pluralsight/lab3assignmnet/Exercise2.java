package com.pluralsight.lab3assignmnet;

import java.util.Scanner;

public class Exercise2 {
	static class mirrorImage {
		String getImage(String str) {
			int len = str.length();
			char[] mirror = new char[len];
			for (int i = len - 1; i >= 0; i--) {
				mirror[(len - 1) - i] = str.charAt(i);
			}
			StringBuilder SB = new StringBuilder();
			return str + "|" + SB.append(mirror);
		}

		public static void main(String[] args) {
			Scanner Sc = new Scanner(System.in);
			System.out.print("Input :");
			String input = Sc.nextLine();
			mirrorImage obj = new mirrorImage();
			System.out.println(obj.getImage(input));
		}
	}

}
