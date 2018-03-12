package com.batchtwoproject.basicexamples;

import java.util.Scanner;

public class EvenandOdd {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner evenodd = new Scanner(System.in);
			int i,n;

			System.out.println("Enter a number:");
			n = evenodd.nextInt();
			System.out.println("Even numbers are:");
			for(i=0;i<=n;i++) {
				if(i%2 == 0) {
					System.out.println(i);
				}
			}
			System.out.println("Enter a number:");
			n = evenodd.nextInt();
			System.out.println("Odd numbers are:");
			for(i=0;i<=n;i++) {
				if(i%2 != 0) {
					System.out.println(i);
				}
			}
		} catch (Exception e){
			System.out.println(e);
		}
	}
	
}
