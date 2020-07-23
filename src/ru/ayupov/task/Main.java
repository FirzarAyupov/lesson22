package ru.ayupov.task;

import java.util.*;

/**
 * Написать класс PersonSuperComparator, который реализует Comparator,
 * но умеет сравнивать по двум параметрам, возраст и имя.
 * <p>
 * Класс Person теперь содержит два поля int age и String name
 */

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> personList = new ArrayList<>();

        personList.add(new Person("Иван", 24));
        personList.add(new Person("Лилия", 65));
        personList.add(new Person("Иван", 45));
        personList.add(new Person("Лилия", 5));
        personList.add(new Person("Иван", 15));

        printTableHead();

        Iterator<Person> i = personList.iterator();
        while (i.hasNext()) {
            System.out.println(i.next().toString());
        }

        System.out.println();

        printTableHead();

        personList.sort(new PersonSuperComparator());

        i = personList.iterator();
        while (i.hasNext()) {
            System.out.println(i.next().toString());
        }
    }

    static void printTableHead() {
        System.out.printf("%-8s|%7s%n", "Имя", "Возраст");
        System.out.println(new String(new char[17]).replace("\0", "-"));
    }
}
