package com.batchtwoproject.basicexamples;

public class BoatVerticalPattern {

	public static void main(String[] args) {
		try {
			int k=13;
			for(int i=0;i<=10;i++) {
				for (int j=1;j<=k;j++){
					System.out.print(" ");
				}
				for (int j=1;j<=i;j++){
					System.out.print(" * ");
				}
				System.out.println();
				k=k-2;
			}

			for(int i=10;i>=1;i--) {
				for (int j=1;j<=k;j++){
					System.out.print(" ");
				}
				for (int j=i;j>=1;j--){
					System.out.print(" * ");
				}
				System.out.println();
				k=k+2;
			}
		} catch (Exception e){
			System.out.println(e);
		}
	}

}
