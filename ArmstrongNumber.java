package com.batchtwoproject.basicexamples;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		try {
            @SuppressWarnings("resource")
            Scanner armstrong = new Scanner(System.in);
            int original,num,temp,sum=0;
            System.out.println("Enter a number:");
            original = armstrong.nextInt();
            temp = original;
            while(temp>0){
                num =  temp%10;
                sum = sum + (num * num * num);
                temp = temp/10;
            }
            if(original == sum) {
                System.out.println("Armstrong Number");
            }else{
                System.out.println("Not Armstrong Number");
            }
        } catch (Exception e){
            System.out.println(e);
        }
	}

}
