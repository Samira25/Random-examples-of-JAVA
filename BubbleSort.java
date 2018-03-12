package com.batchtwoproject.basicexamples;

import java.util.Scanner;

public class BubbleSort {

	public static void bubblesort(int[] array) {
		int temp=0,i,j,n;
		n = array.length;
		for (i=0;i<n;i++){
			for (j=1;j<(n-i);j++){
				if (array[j-1]>array[j]){
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner sort = new Scanner(System.in);

			System.out.println("Enter the number of elements:");
			int[] array = new int[sort.nextInt()];

			System.out.println("Enter the elements:");
			for (int j=0; j<array.length; j++){
				array[j] = sort.nextInt();
			}

			bubblesort(array);
			System.out.println("Sorted elements");
			for (int i=0;i<array.length;i++){
				System.out.println(array[i]);
			}
		} catch (Exception e){
			System.out.println(e);
		}
	}

}
