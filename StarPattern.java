package com.batchtwoproject.basicexamples;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner star = new Scanner(System.in);
			int i,j,k,n;

			//For (+)90 degree star pattern
			System.out.println("How many row you want?");
			n = star.nextInt();
			System.out.println("The (+)90 degree star pattern");
			for(i=0;i<=n;i++) {
				for (j=1;j<=i;j++){
					System.out.print(" * ");
				}
				System.out.println();
			}


			//For (-)90 degree star pattern
			System.out.println("How many row you want?");
			n = star.nextInt();
			System.out.println("The (-)90 degree star pattern");
			for(i=n;i>=1;i--) {
				for (j=1;j<=i;j++){
					System.out.print(" * ");
				}
				System.out.println();
			}


			//For (+)pyramid star pattern
			System.out.println("How many row you want?");
			n = star.nextInt();
			System.out.println("The pyramid star pattern");
			for(i=1; i<=n; i++) {
				for (j=n-1; j>=i; j--){
					System.out.print(" ");
				}
				for (k=1; k<=(2*i-1); k++){
					System.out.print("*");
				}
				System.out.println("");
			}


			//For (-)pyramid star pattern
			System.out.println("How many row you want?");
			n = star.nextInt();
			System.out.println("The pyramid star pattern");
			for(i=n; i>=1; i--) {
				for (j=n-1; j>=i; j--){
					System.out.print(" ");
				}
				for (k=1; k<=(2*i-1); k++){
					System.out.print("*");
				}
				System.out.println("");
			}
		} catch (Exception e){
			System.out.println(e);
		}
	}

}
