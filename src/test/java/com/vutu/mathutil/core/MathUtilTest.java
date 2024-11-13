/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.vutu.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author vuanh
 */
public class MathUtilTest {
    public static Object[][] initData() {
        return new Integer[][] {
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24}
        };
    }
//    
//    @Test
//    public void testGetFactorialGivenRightArgReturnWell() {
//        assertEquals(24, MathUtil.getFactorial(4));
//    }
  
    @ParameterizedTest
    @MethodSource(value = "initData")
    public void testGetFactorialGivenRightArgReturnWell(int input, long expected) {
        assertEquals(expected, MathUtil.getFactorial(input));
    }
    
//    @Test
//    public void testGetFactorialGivenWrongArgThrowException() {
////        Executable exObject = new Executable() {
////            @Override
////            public void execute() throws Throwable {
////                MathUtil.getFactorial(-5);
////            }
////        };
////        assertThrows(IllegalArgumentException.class, exObject);
//
////           Executable exObject = () -> MathUtil.getFactorial(-5);
////           assertThrows(IllegalArgumentException.class, exObject);
//           
//           assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-5));
//    }
}