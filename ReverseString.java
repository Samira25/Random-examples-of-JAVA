package com.batchtwoproject.basicexamples;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner str = new Scanner(System.in);
			String n;

			System.out.println("Enter string:");
			n = str.next();

			System.out.println("Reversed string:");
			StringBuilder sb = new StringBuilder(n);
			sb.reverse();
			String reverse = sb.toString();
			System.out.print(reverse);
		} catch (Exception e){
			System.out.println(e);
		}
	}

}