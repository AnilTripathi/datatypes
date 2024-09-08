package com.data.types;

import java.util.Scanner;

public class InchToCm {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Input a value for inch: ");
			double inch = input.nextDouble();
			double meters = inch * 0.0254;
			System.out.println(inch + " inch is " + meters + " meters");
		} finally {
			System.out.println("DONE");
		}
	}
}
