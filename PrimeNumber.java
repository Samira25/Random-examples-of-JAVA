package com.batchtwoproject.basicexamples;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner prime = new Scanner(System.in);
			int i;
			System.out.println("Enter a number:");
			i = prime.nextInt();
			if(i%2 == 0) {
				System.out.println(i + " is not a prime number");
			}else{
				System.out.println(i + " is a prime number");
			}
		} catch (Exception e){
			System.out.println(e);
		}
	}

}