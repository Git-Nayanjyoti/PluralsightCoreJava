package com.pluralsight.lab3assignmnet;

import java.util.Scanner;

public class Exercise4 {
	static class numberModifier {
		int modifyNumber(int n) {
			int newNum = 0;
			int len = String.valueOf(n).length();
			int[] modNum = new int[len];
			int j = len - 1;
			while (n > 0) {
				modNum[j] = n % 10;
				n = n / 10;
				j--;
			}
			for (int i = 0; i < len - 1; i++) { 
				modNum[i] = (modNum[i] - modNum[i + 1]> 0? modNum[i] - modNum[i+1]:modNum[i+1] - modNum[i]);
			}
			for (int i = 0; i < len; i++) {
				newNum = newNum * 10 + modNum[i];
			}
			return newNum;
		}

		public static void main(String[] args) {
			Scanner Sc = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int num = Sc.nextInt();
			numberModifier obj = new numberModifier();
			System.out.println("Modified Number is: " + obj.modifyNumber(num));
		}
	}

}
