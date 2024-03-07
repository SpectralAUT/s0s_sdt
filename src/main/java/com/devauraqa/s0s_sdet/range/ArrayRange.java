package com.devauraqa.s0s_sdet.range;

public class ArrayRange {

	public static void main(String[] args) {
		int startRange = 1;
		int endRange = 100; 

		
		int arraySize = endRange - startRange + 1;

	
		int[] numbersArray = new int[arraySize];

		for (int i = startRange; i <= endRange; i++) {
			numbersArray[i - startRange] = i;
		}

		
		System.out.println("Numbers are======>:");

		for (int number : numbersArray) {
			System.out.print(number + " ");
		}
	}

}
