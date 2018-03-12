package com.batchtwoproject.basicexamples;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner fact = new Scanner(System.in);
			int res=1,i,count;
			System.out.println("Enter a number:");
			count = fact.nextInt();
			for(i=1; i<=count; i++) {
				res = res * i;
			}
			System.out.println(res);
		} catch (Exception e){
			System.out.println(e);
		}
	}

}