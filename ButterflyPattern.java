package com.batchtwoproject.basicexamples;

public class ButterflyPattern {

	public static void main(String[] args) {
		try {
			int space=18;
			for(int i=1; i<10; i++)
			{
				//print first part of the row
				for(int j=1; j<=i; j++)
					System.out.print("*");

				//print space
				for(int j=1;j<=space; j++)
					System.out.print(" ");

				//print second part of the row
				for(int j=1; j<=i; j++)
					System.out.print("*");

				//print new lint
				System.out.println();
				space=space-2;
			}
			space=0;
			for(int i=10; i>=1; i--)
			{
				//print first part of the row
				for(int j=i; j>=1; j--)
					System.out.print("*");

				//print space
				for(int j=1;j<=space; j++)
					System.out.print(" ");

				//print second part of the row
				for(int j=i; j>=1; j--)
					System.out.print("*");

				//print new lint
				System.out.println();
				space=space+2;
			}
		} catch (Exception e){
			System.out.println(e);
		}
	}

}
