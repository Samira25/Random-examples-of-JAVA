package com.batchtwoproject.basicexamples;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner number = new Scanner(System.in);
			int i,j,n;


			//Pattern-1
			System.out.println("How many row you want?");
			n = number.nextInt();
			System.out.println("Pattern-1");
			for(i=0;i<=n;i++) {
				for (j=1;j<=i;j++){
					System.out.print(j + " ");
				}
				System.out.println();
			}


			//Pattern-2
			System.out.println("How many row you want?");
			n = number.nextInt();
			System.out.println("Pattern-2");
			for(i=n;i>=1;i--) {
				for (j=1;j<=i;j++){
					System.out.print(j + " ");
				}
				System.out.println();
			}


			//Pattern-3
			System.out.println("How many row you want?");
			n = number.nextInt();
			System.out.println("Pattern-3");
			for(i=1;i<=n;i++) {
				for (j=1;j<=i;j++){
					System.out.print(i + " ");
				}
				System.out.println();
			}


			//Pattern-4
			System.out.println("How many row you want?");
			n = number.nextInt();
			System.out.println("Pattern-4");
			for(i=0;i<=n;i++) {
				for (j=1;j<=i;j++){
					System.out.print(j + " ");
				}
				System.out.println();
			}
			for(i=n-1;i>=1;i--) {
				for (j=1;j<=i;j++){
					System.out.print(j + " ");
				}
				System.out.println();
			}


			//Pattern-5
			System.out.println("How many row you want?");
			n = number.nextInt();
			System.out.println("Pattern-5");
			for(i=0;i<=n;i++) {
				for (j=i;j>=1;j--){
					System.out.print(j + " ");
				}
				System.out.println();
			}


			//Pattern-6
			System.out.println("How many row you want?");
			n = number.nextInt();
			System.out.println("Pattern-6");
			for(i=1;i<=n;i++) {
				for (j=n;j>=i;j--){
					System.out.print(j + " ");
				}
				System.out.println();
			}


			//Pattern-7
			System.out.println("How many row you want?");
			n = number.nextInt();
			System.out.println("Pattern-7");
			for(i=n;i>=1;i--) {
				for (j=n;j>=i;j--){
					System.out.print(j + " ");
				}
				System.out.println();
			}


			//Pattern-8
			System.out.println("How many row you want?");
			n = number.nextInt();
			System.out.println("Pattern-8");
			for(i=n;i>=1;i--) {
				for (j=i;j>=1;j--){
					System.out.print(j + " ");
				}
				System.out.println();
			}
		} catch (Exception e){
			System.out.println(e);
		}
	}

}
