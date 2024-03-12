package com.devauraqa.s0s_sdet.range;

import java.util.Scanner;

public class PascalLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter the number of rows for Pascal's Triangle =====> :  ");
			int numRows = scanner.nextInt();
			printPascalsTriangle(numRows);
		} finally {
			scanner.close();
		}
	}

	private static void printPascalsTriangle(int numRows) {

		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j <= numRows - i; j++) {
				System.out.print(" ");
			}

			int number = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(number + " ");
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}
