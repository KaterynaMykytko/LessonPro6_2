package org.course.ex6_2;

import annotation.Calculation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Class<? extends Calculator> cl = calculator.getClass();
        try {
            Method method = cl.getDeclaredMethod("sum", int.class, int.class);
            Calculation annotation = method.getAnnotation(Calculation.class);
            int value1 = annotation.num1();
            int value2 = annotation.num2();
            int sum = calculator.sum(value1, value2);
            System.out.println(sum);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
