package ru.pavlova.lesson.staticCalculator;

public class CalculatorMain2 {
    public static void main(String[] args) {

        System.out.println("5 + 9 = " + Calculator2.sum(5, 9));
        System.out.println("5 - 9 = " + Calculator2.subtraction(5, 9));
        System.out.println("5 * 9 = " + Calculator2.multiplication(5, 9));
        System.out.println("5 / 0 = " + Calculator2.division(5, 0));
        System.out.println("5 ^ 9 = " + Calculator2.power(5, 9));
        System.out.println("5! = " + Calculator2.factorial(5));

        Calculator2.printOperationCounter();
    }
}
