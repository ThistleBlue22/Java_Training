package com.spartaglobal.exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static Logger logger = LogManager.getLogger("Calc Logger");
    public static int divide(int a, int b){
        logger.error("Just made this Calculator");
        if (b == 0) throw new DivideByZeroException("Divisor cannot be 0");
        return a/b;
    }

    public static void main(String[] args) {

        System.out.println(divide(1,1));
    }
}
