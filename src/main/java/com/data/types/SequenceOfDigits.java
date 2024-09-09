package com.data.types;

import java.util.Scanner;

public class SequenceOfDigits {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Input six non-negative digits: ");
			int input = in.nextInt();
			StringBuilder sb = new StringBuilder();
			do {
				int temp = input % 10;
				sb.append(temp + " ");
				input = input / 10;
			} while (input > 0);
			System.out.println(sb.reverse().toString().trim());
		} finally {
			System.out.println("DONE");
		}
	}
}
