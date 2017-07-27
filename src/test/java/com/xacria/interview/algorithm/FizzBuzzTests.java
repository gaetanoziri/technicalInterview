package com.xacria.interview.algorithm;

import com.xacria.interview.algorithm.FizzBuzz;
import com.xacria.interview.algorithm.Solutions;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by fre on 18/07/17.
 */
public class FizzBuzzTests extends Assert {

    @Test
    public void fizzBuzzTest(){
        for (int i = 0; i <= 100; i++)
            assertEquals(Solutions.fizzBuzz(i), FizzBuzz.generate(i));
    }


}
