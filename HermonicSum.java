package com.batchtwoproject.basicexamples;

import java.util.Scanner;

public class HermonicSum {

	public static double sum(float n) {
		if(n == 1) {
			return 1.0;
		}
		else {
			return (1.0 / n) + sum(n-1);
		}
	}

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner hsum = new Scanner(System.in);
			float n;
			System.out.println("Enter a number:");
			n = hsum.nextInt();

			System.out.println("Result of hermonic sum is " + sum(n));
		} catch (Exception e){
			System.out.println(e);
		}
	}

}
