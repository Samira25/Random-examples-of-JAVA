package com.batchtwoproject.basicexamples;

public class AmericanFlagPattern {

	public static void main(String[] args) {
		try {
			for (int i = 0 ; i < 20 ; i++){
				for (int k =0 ; k < 5 ; k++){
					System.out.print(" * ");
				}
				for (int j = 0 ; j < 15 ; j++){
					System.out.print(" = ");
				}
				System.out.println();
			}
			for (int i = 0 ; i < 10 ; i++){
				for (int j = 0 ; j < 20 ; j++){
					System.out.print(" = ");
				}
				System.out.println();
			}
		} catch (Exception e){
			System.out.println(e);
		}
	}

}
