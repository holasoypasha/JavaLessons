package ru.pavlova.lesson.calculator;

public class SimpleCalculator implements Calculator {
    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    @Override
    public double subtraction(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a * b;
    }

    @Override
    public double division(double a, double b) {
        if (b != 0) {
            return a / b;
        }
        else {
            return 0;
        }
    }

    @Override
    public double power(double a, double n) {
        return Math.pow(a, n);
    }

    @Override
    public int factorial(int n) {
        int result = 1;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
        }
        else {
            System.out.println("Нельзя посчитать факториал отрицвтельного числа");
        }

        return result;
    }
}