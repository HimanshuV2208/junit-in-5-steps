package com.himanshu.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    private MyMath math = new MyMath();

    @Test
    void calculateSum_ThreeElementArray() {
        int result = math.calculateSum(new int[]{1,2,3});
        int expectedResult = 6;
        assertEquals(expectedResult, result);
    }

    @Test
    void calculateSum_ZeroElementArray() {
        int result = math.calculateSum(new int[]{});
        int expectedResult = 0;
        assertEquals(expectedResult, result);
    }

}