package com.batchtwoproject.basicexamples;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")

			//Binary to Decimal
					Scanner bintodec = new Scanner(System.in);

			System.out.println("Enter binary number");
			String btd = bintodec.next();

			System.out.println("Decimal number is: " + Integer.parseInt(btd,2));


			//Decimal to Binary
			@SuppressWarnings("resource")
			Scanner dectobin = new Scanner(System.in);

			System.out.println("Enter decimal number");
			int dtb = dectobin.nextInt();

			System.out.println("Binary number is: " + Integer.toBinaryString(dtb));
		} catch (Exception e){
			System.out.println(e);
		}
	}

}