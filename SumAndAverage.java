package com.batchtwoproject.basicexamples;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner sumnavg = new Scanner(System.in);
			float sum=0,i,count,avg;
			System.out.println("Enter a number:");
			count = sumnavg.nextInt();
			for(i=1; i<=count; i++) {
				sum = sum + i;
			}
			System.out.println("Sum of total number is " +  sum);
			avg = sum / count;
			System.out.println("Average value is " +  avg);
		} catch (Exception e){
			System.out.println(e);
		}
	}

}
