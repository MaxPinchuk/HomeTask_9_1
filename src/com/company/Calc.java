package com.company;

/**
 * 1 Создать утилитный класс Калькулятор
 * <p>
 * Создать класс с ТОЛЬКО с статическими методами.
 * <p>
 * Методы:
 * add(a,b) - сумма чисел,
 * sub(a,b) - разница чисел,
 * mul(a,b) - умножение чисел,
 * div(a,b) - деление чисел
 * <p>
 * каждый метод должен возвращать результат (т е НЕ void!)
 * перегрузить методы, для возможности использовать int и double для всех этих методов
 * Создать класс Test с main методом и протестировать все методы.
 */

public class Calc {

    public static int calc(int a, int b) {
        return a + b;
    }

    public static double calc(double b, double a) {
        return a - b;
    }

    public static double calc(int a, double b) {
        return a / b;
    }

    public static double calc(double a, int b) {
        return a * b;
    }
}