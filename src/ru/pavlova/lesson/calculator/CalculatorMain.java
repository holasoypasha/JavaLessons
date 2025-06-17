package ru.pavlova.lesson.calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new SimpleCalculator();

        System.out.println("5 + 9 = " + calculator.sum(5, 9));
        System.out.println("5 - 9 = " + calculator.subtraction(5, 9));
        System.out.println("5 * 9 = " + calculator.multiplication(5, 9));
        System.out.println("5 / 9 = " + calculator.division(5, 9));
        System.out.println("5 ^ 9 = " + calculator.power(5, 9));
        System.out.println("5! = " + calculator.factorial(5));
    }
}