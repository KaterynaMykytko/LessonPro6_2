package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Антотація @Target визначає, що дана атотація буде застосована лише для методу.
 *
 * Застосування @Retention визначає політику утримання антотації,
 * на якому етапі до неї буде доступ чи ні.
 *
 * Антотація @interface Calculation власна анотація
 * з параметрами @param num1, num2 - вхідні параметри для методу sum();
 *
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Calculation {
    int num1();
    int num2();
}
