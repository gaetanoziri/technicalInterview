package com.xacria.interview.algorithm;

/**
 Write a program that prints the integers from   1   to  N
 But:


 for multiples of three,   print   Fizz     (instead of the number)
 for multiples of five,   print   Buzz     (instead of the number)
 for multiples of both three and five,   print   FizzBuzz     (instead of the number)
 Ex FizzBuzz.generate(6) will generate
 1 2 Fizz 4 Buzz Fizz
 */
public class FizzBuzz {

    public static String generate(int count){
    	StringBuffer buff = new StringBuffer();
    	for (int i = 1; i <= count; i++) {
    		buff.append(getString(i));
		}
    	String result = buff.toString();
    	if(!result.isEmpty()){
    		result = result.substring(0, result.length() -1);
    	}
        return result;
    }
    
	private static String getString(int i) {
		if (i % 3 == 0 && i % 5 == 0) {
			return "Fizz Buzz ";
		}
		if (i % 3 == 0) {
			return "Fizz ";
		}
		if (i % 5 == 0) {
			return "Buzz ";
		}
		return i + " ";
	}
    
    public static void main(String[] args){
    	System.out.println(generate(15));
    }

}
