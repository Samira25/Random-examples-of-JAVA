package com.batchtwoproject.basicexamples;

import java.util.Scanner;

public class CalculateArea {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner area = new Scanner(System.in);
			double r,circle,h,b,triangle,w,l,rectangle,a,square;

			System.out.println("Circle Area calculate");
			System.out.println("Enter radius");
			r = area.nextInt();

			circle = 2*Math.PI*r;
			System.out.println("The area of circle is: " + circle);

			System.out.println("\nTriangle Area calculate");
			System.out.println("Enter height");
			h = area.nextInt();
			System.out.println("Enter base");
			b = area.nextInt();

			triangle = (h * b) / 2;
			System.out.println("The area of triangle is: " + triangle);

			System.out.println("\nRectangle Area calculate");
			System.out.println("Enter width");
			w = area.nextInt();
			System.out.println("Enter length");
			l = area.nextInt();

			rectangle = w * l;
			System.out.println("The area of rectangle is: " + rectangle);

			System.out.println("\nSquare Area calculate");
			System.out.println("Enter side");
			a = area.nextInt();

			square = Math.pow(a,2);
			System.out.println("The area of square is: " + square);
		}catch (Exception e){
			System.out.println(e);
		}
	}

}
