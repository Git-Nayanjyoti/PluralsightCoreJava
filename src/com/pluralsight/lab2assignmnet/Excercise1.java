package com.pluralsight.lab2assignmnet;

import java.util.Arrays;

public class Excercise1 {
	public int getSecondSmallest(int arr[]) {
		//Arrays.sort(arr);
		//return arr[1];
		int secondSmallest = 0;
		for(int i = 0; i < arr.length; i++) {
			int temp;
			for(int j = i; j < arr.length-1; j++) {
				if(arr[i] > arr[j+1]) {
					temp = arr[i];
					arr[i] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		secondSmallest = arr[1];
		return secondSmallest;
	}
	public static void main(String[] args) {
		int array[] = {1,9,7,6,10,22};
		System.out.println("The array of integer is :");
		System.out.println(Arrays.toString(array));
		Excercise1 obj = new Excercise1();
		System.out.println("The second smallest in the given array is: " + obj.getSecondSmallest(array));
	}

}
