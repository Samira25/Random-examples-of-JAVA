package com.batchtwoproject.basicexamples;

import java.util.Scanner;

public class DayinWord {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner dayinword = new Scanner(System.in);
			int n;

			System.out.println("Enter the number:");
			n = dayinword.nextInt();

			switch(n) {
				case 1: System.out.println("Sunday"); break;
				case 2: System.out.println("Monday"); break;
				case 3: System.out.println("Tuesday"); break;
				case 4: System.out.println("Wednesday"); break;
				case 5: System.out.println("Thrusday"); break;
				case 6: System.out.println("Friday"); break;
				case 7: System.out.println("Saturday"); break;
				default: System.out.println("Not a valid day");
			}
		} catch (Exception e){
			System.out.println(e);
		}
	}

}
