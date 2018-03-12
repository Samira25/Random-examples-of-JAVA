package com.batchtwoproject.basicexamples;

import java.util.Scanner;

public class NumberInWord {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner numinword = new Scanner(System.in);
			int n;

			System.out.println("Enter the number:");
			n = numinword.nextInt();

		/*
		if(n == 1) {
			System.out.println("One");
		}
		else if(n == 2) {
			System.out.println("Two");
		}
		else if(n == 3) {
			System.out.println("Three");
		}
		else if(n == 4) {
			System.out.println("Four");
		}
		else if(n == 5) {
			System.out.println("Five");
		}
		else {
			System.out.println("Other");
		}
		*/

			switch(n) {
				case 1: System.out.println("One"); break;
				case 2: System.out.println("Two"); break;
				case 3: System.out.println("Three"); break;
				case 4: System.out.println("Four"); break;
				case 5: System.out.println("Five"); break;
				default: System.out.println("Other");
			}
		} catch (Exception e){
			System.out.println(e);
		}
	}

}
