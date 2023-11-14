package org.course.ex6_2;

import annotation.Calculation;

/**
 * Застосування анотації @Calculation у методі.
 * @Calculation передає значення вхідних параметрів у метод.
 *
 * Метод sum() рахує суму двох елементів.
 * @param num1, num2 вхідні параметри методу.
 * @return повертає суму двох елементів типу int.
 */

public class Calculator {

    @Calculation(num1 = 30, num2 = 50)
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

}
