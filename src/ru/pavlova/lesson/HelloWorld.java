package ru.pavlova.lesson;

import ru.pavlova.lesson.entity.Human;
import ru.pavlova.lesson.entity.Men;
import ru.pavlova.lesson.entity.Women;

class HelloWorld {

    public static void main(String[] args) {
        //СОздаем объект класса Women
        Women masha = new Women();
        //СОздаем объект класса Men с изначальными значениями
        Men stas = new Men("Стас", 27, 180);

        //Вызываем сеттер для установки возраста
        masha.setAge(19);
        //Вызываем сеттер для установки роста
        masha.setHeight(170);
        //Вызываем сеттер для установки имени
        masha.setName("Маша");
        //изменяем имя у объекта
        masha.setName("Мария");

        //Вызываем метод родительского класса у объекта masha
        masha.sayAboutMe();
        //Вызываем метод родительского класса у объекта stas
        stas.sayAboutMe();

        returnGeneralAge(stas, masha);
    }

    /**
     * Выводит сумму возрастов двух людей
     * @param human1 первый человек
     * @param human2 второй человек
     */
    static void returnGeneralAge(Human human1, Human human2){
        int generalAge = human1.getAge() + human2.getAge();
        System.out.println("У Маши со Стасом на двоих возраст равен " + generalAge);
    }
}