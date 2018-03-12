package com.batchtwoproject.basicexamples;

import java.util.Scanner;

public class CozaLozaWoza {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner clw = new Scanner(System.in);
			int n,i;
			System.out.println("How many numbers?");
			n = clw.nextInt();

			for(i=1;i<=n;i++) {
				if(i%3 == 0) {
					System.out.print("Coza ");
				}
				else if(i%5 == 0) {
					System.out.print("Loza ");
				}
				else if(i%7 == 0) {
					System.out.print("Woza ");
				}
				else {
					System.out.print(i + " ");
				}
			}
		} catch (Exception e){
			System.out.println(e);
		}
	}

}
