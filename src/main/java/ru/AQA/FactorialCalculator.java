package ru.AQA;
public class FactorialCalculator {

    public static int factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Факториал отрицательного числа не определен");
        if (n == 0)
            return 1;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
