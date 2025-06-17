package ru.pavlova.lesson.calculator;

/**
 * Интерфейс калькулятора
 */
public interface Calculator {
    /**
     * Суммирование
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма двух чисел
     */
    double sum(double a,double b);

    /**
     * Вычитание
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность двух чисел
     */
    double subtraction(double a, double b);

    /**
     * Умножение
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение двух чисел
     */
    double multiplication(double a, double b);

    /**
     * Деление
     * @param a делимое
     * @param b делитель
     * @return частное
     */
    double division(double a, double b);

    /**
     * Возведение в степень
     * @param a основание степени
     * @param n показатель степени
     * @return степень
     */
    double power(double a, double n);

    /**
     * Факториал
     * @param n число, возводимое в факториал
     * @return факториал числа n
     */
    int factorial(int n);
}