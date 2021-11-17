package com.pluralsight.lab1assignment;

public class Excerice3 {
		public void show(int n) {
			for (int i = 2; i < n; i++) {
				int cnt = 0;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						cnt = 1;
					}
				}
				if (cnt == 0) {
					System.out.print(i + " ");
				}
			}
		}
	 

		public static void main(String[] args) {
			@SuppressWarnings("resource")
			java.util.Scanner Sc = new java.util.Scanner(System.in);
			Excerice3 ps = new Excerice3();
			System.out.print("Enter the value : ");
			int num = Sc.nextInt();
			System.out.print("Prime numbers below " + num + " are : ");
			ps.show(num);
		}
	

}
