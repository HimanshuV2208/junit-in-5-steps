package com.himanshu.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    @Test
    void test() {
        //fail("Not yet implemented");
        int[] numbers = {1,2,3};
        MyMath math = new MyMath();
        int result = math.calculateSum(numbers);
        int expectedResult = 6;
        assertEquals(expectedResult, result);
    }

    @Test
    void test2() {
        int[] numbers = {};
        MyMath math = new MyMath();
        int result = math.calculateSum(numbers);
        int expectedResult = 0;
        assertEquals(expectedResult, result);
    }

}