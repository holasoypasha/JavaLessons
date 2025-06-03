package ru.pavlova.lesson;

import ru.pavlova.lesson.entity.Human;
import ru.pavlova.lesson.entity.Men;
import ru.pavlova.lesson.entity.Women;
import ru.pavlova.lesson.entity.animal.Cat;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

        //Создаем массив из human
        Human humans[] = new Human[] {masha, stas};
        System.out.println("Возраст людей: " + sumAge(humans));

        //Создаем ArrayList
        List<Human> humanList = new ArrayList<>();
        //Создаем LinkedList
        List<Human> humanList1 = new LinkedList<>();

        //Добавляем в лист masha, stas и нового Human
        humanList.add(masha);
        humanList.add(stas);
        humanList.add(new Human(23,180));

        System.out.println("Возраст людей: " + sumAge(humanList));

        //Добавляем masha новых котов
        masha.getAnimals().add(new Cat());
        masha.getAnimals().add(new Cat());

        masha.sayAboutMe();

    }

    /**
     * Суммирование возраста людей в массиве
     * @param humans люди
     * @return сумму возрастов
     */
    private static int sumAge(Human humans[]) {
        int sum = 0;
        for (int i = 0; i < humans.length; i++) {
            sum += humans[i].getAge();
        }
        return sum;
    }

    /**
     * Суммированеи возраста людей в ArrayList
     * @param humanList люди
     * @return сумму возрастов
     */
    private static int sumAge(List<Human> humanList) {
        int sum = 0;
        for (int i = 0; i < humanList.size(); i++) {
            sum += humanList.get(i).getAge();
        }
        return sum;
    }
}