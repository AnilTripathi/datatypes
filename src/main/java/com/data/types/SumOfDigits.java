package com.data.types;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Input an integer between 0 and 1000: ");
			int num = input.nextInt();
			int tmpNum = num;
			int sum = 0;
			do {
				int digit = tmpNum % 10;
				sum += digit;
				int remainingNumber = tmpNum / 10;
				tmpNum = remainingNumber;
			} while (tmpNum > 0);
			System.out.println("The sum of all digits in " + num + " is " + sum);
		} finally {
			System.out.println("DONE");
		}
	}
}
