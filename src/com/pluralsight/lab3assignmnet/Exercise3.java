package com.pluralsight.lab3assignmnet;

import java.util.Scanner;

public class Exercise3 {

	static class AlterString {
		boolean isVowel(char ch) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				return true;
			}
			return false;
		} 

		String alterString(String str) {
			String newStr = null;
			StringBuilder SB = new StringBuilder();
			String temp = str.toLowerCase();
			char[] arr = new char[str.length()];
			for (int i = 0; i < str.length(); i++) {

				if (isVowel(temp.charAt(i)) == false) {
					int asciiValue = str.charAt(i);
					char nextChar;
					if (str.charAt(i) == 'z') {
						nextChar = 'a';
					} else if (str.charAt(i) == 'Z') {
						nextChar = 'A';
					} else {
						nextChar = (char) (asciiValue + 1);
					}
					arr[i] = nextChar;
				} else {
					arr[i] = str.charAt(i);
				}
			}
			newStr = "Output :" + SB.append(arr);
			return newStr;
		}

		public static void main(String[] args) {
			Scanner Sc = new Scanner(System.in);
			System.out.print("Enter a String: ");
			String input = Sc.nextLine();
			AlterString obj = new AlterString();
			System.out.println(obj.alterString(input));
		}
	}

}
