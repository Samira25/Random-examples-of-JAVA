package com.batchtwoproject.basicexamples;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        try {
            @SuppressWarnings("resource")
			Scanner palin = new Scanner(System.in);

            //Palindrome number
            int original,num,temp,reverse=0;
            System.out.println("Enter a number:");
            original = palin.nextInt();
            temp = original;
            while(temp>0){
                num =  temp%10;
                reverse = (reverse * 10) + num;
                temp = temp/10;
            }
            if(original == reverse) {
                System.out.println("Palindrome Number");
            }else{
                System.out.println("Not Palindrome Number");
            }

            //Palindrome string
            String str;
            System.out.println("\nEnter a string:");
            str = palin.next();
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            String rev = sb.toString();
            if (str.equals(rev)){
                System.out.println("Palindrome string");
            } else {
                System.out.println("Not palindrome string");
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}