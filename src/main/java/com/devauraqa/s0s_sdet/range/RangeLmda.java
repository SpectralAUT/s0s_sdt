package com.devauraqa.s0s_sdet.range;

import static java.util.stream.IntStream.rangeClosed;

public class RangeLmda {

	public static void main(String[] args) {

		int initRange = 0;
		int endRange = 20;

		rangeClosed(initRange, endRange).forEach(number -> System.out.println(number + " "));

	}

}
