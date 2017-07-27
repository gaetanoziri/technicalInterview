package com.xacria.interview.algorithm;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by fre on 18/07/17.
 */
public class Solutions {
	public static String fizzBuzz(int count) {
		return IntStream.range(1, count + 1).mapToObj(i -> {
			if (i % 15 == 0)
				return "Fizz Buzz";
			if (i % 3 == 0)
				return "Fizz";
			if (i % 5 == 0)
				return "Buzz";
			return i + "";
		}).collect(Collectors.joining(" "));
	}

}
