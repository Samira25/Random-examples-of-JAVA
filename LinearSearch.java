package com.batchtwoproject.basicexamples;

import java.util.Scanner;

public class LinearSearch {

	public static int search(int[] array, int key) {
		for (int i=0;i<array.length;i++){
			if (array[i]==key){
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner search = new Scanner(System.in);

			System.out.println("Enter the number of elements:");
			int[] array = new int[search.nextInt()];

			System.out.println("Enter the elements:");
			for (int i=0; i<array.length; i++){
				array[i] = search.nextInt();
			}

			System.out.println("Which element do you want to search?");
			int key = search.nextInt();

			int n = search(array, key);
			System.out.println(key+" is found at index: "+n);
		} catch (Exception e){
			System.out.println(e);
		}
	}
}