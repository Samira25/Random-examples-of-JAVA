package com.batchtwoproject.basicexamples;

import java.util.Scanner;

public class Marks {
	
	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner marks = new Scanner(System.in);
			int n;

			System.out.println("Enter the number:");
			n = marks.nextInt();

			System.out.println("East West University : Grade");
			if(n<60) {
				System.out.println("Oh you poor thing, you idiotic stupid, you failed");
			}
			else if(n>=60 && n<63){
				System.out.println("You got D which means 1.00");
			}
			else if(n>=63 && n<67){
				System.out.println("You got D+ which means 1.30");
			}
			else if(n>=67 && n<70){
				System.out.println("You got C- which means 1.70");
			}
			else if(n>=70 && n<73){
				System.out.println("You got C which means 2.00");
			}
			else if(n>=73 && n<77){
				System.out.println("You got C+ which means 2.30");
			}
			else if(n>=77 && n<80){
				System.out.println("You got B- which means 2.70");
			}
			else if(n>=80 && n<83){
				System.out.println("You got B which means 3.00");
			}
			else if(n>=83 && n<87){
				System.out.println("You got B+ which means 3.30");
			}
			else if(n>=87 && n<90){
				System.out.println("You got A- which means 3.70");
			}
			else if(n>=90 && n<97){
				System.out.println("You got A which means 4.00");
			}
			else if(n>=97 && n<=100){
				System.out.println("Congratulations!!! you've got the A+");
			}
			else{
				System.out.println("This is not valid number. Please try again");
			}
		} catch (Exception e){
			System.out.println(e);
		}
	}

}
