package com.batchtwoproject.basicexamples;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner table = new Scanner(System.in);
			int n,i,j,k,l;

			System.out.println("How many?");
			n = table.nextInt();

			for (k=1; k<=n; k++){
				System.out.print("\t" + k);
			}
			System.out.println();
			for (l=1; l<=n; l++){
				System.out.print("\t" + "-");
			}
			System.out.println();
			for(i=1; i<=n; i++) {
				System.out.print(i);
				System.out.print("|");

				for(j=1;j<=n;j++) {
					System.out.print("\t" + i*j);
				}
				System.out.println();
			}
		} catch (Exception e){
			System.out.println(e);
		}
	}

}