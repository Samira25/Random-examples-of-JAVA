package com.batchtwoproject.basicexamples;

import java.util.Scanner;

public class TrigonometricSeries {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner tri = new Scanner(System.in);
			double n;
			System.out.println("What's the number?");
			n = tri.nextDouble();

			System.out.println("Sine value is: " + Math.sin(n));
			System.out.println("Cosine value is: " + Math.cos(n));
			System.out.println("Tangent value is: " + Math.tan(n));
			System.out.println("Exponential value is: " + Math.exp(n));
		} catch (Exception e){
			System.out.println(e);
		}
	}

}
