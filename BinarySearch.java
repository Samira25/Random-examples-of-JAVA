package com.batchtwoproject.basicexamples;

import java.util.Scanner;

public class BinarySearch {

	public static int search(int[] array, int key) {
		int first = 0;
		int last = array.length-1;
		while (first<=last){
			int mid = (first + last)/2;
			if (array[mid] == key){
				return mid;
			}else if (array[mid] <= key){
				first = mid+1;
			}else {
				last = mid-1;
			}
		}
		if (first>last){
			System.out.println("Elements not found");
		}
		return 0;
	}

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);

			System.out.println("Enter the number of elements:");
			int[] array = new int[scan.nextInt()];

			System.out.println("Enter the elements:");
			for (int i=0; i<array.length; i++){
				array[i] = scan.nextInt();
			}

			System.out.println("Which element do you want to search?");
			int key = scan.nextInt();

			System.out.println(key+" is found at index: "+search(array, key));
		} catch (Exception e){
			System.out.println(e);
		}
	}

}