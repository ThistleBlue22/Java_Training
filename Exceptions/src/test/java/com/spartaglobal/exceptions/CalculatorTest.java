package com.spartaglobal.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    @DisplayName("Given a number is divided by zero, then the calculator divide method should throw a \"DivideByZeroException\"")
    public void divideByZero(){
        var ex = Assertions.assertThrows(DivideByZeroException.class, ()-> Calculator.divide(1,0), "No Exception Thrown");
        Assertions.assertEquals("Divisor cannot be 0", ex.getMessage());
    }
}
