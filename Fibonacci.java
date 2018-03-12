package com.batchtwoproject.basicexamples;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner fib = new Scanner(System.in);
			int a=1,b=1,res,i,count;
			System.out.println("Enter a number:");
			count = fib.nextInt();
			for(i=1; i<=count; ++i) {
				System.out.println(a);
				res = a+b;
				a = b;
				b = res;
			}
		} catch (Exception e){
			System.out.println(e);
		}
	}

}
