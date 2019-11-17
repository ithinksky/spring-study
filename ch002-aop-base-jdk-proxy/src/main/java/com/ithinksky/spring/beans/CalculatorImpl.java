package com.ithinksky.spring.beans;

/**
 * @author tengpeng.gao
 * @since 2019-02-22
 */
public class CalculatorImpl implements Calculator {
    @Override
    public int calculate(int a, int b) {
        System.out.println("**********Actual Method Execution**********");
        return a / b;
    }
}
