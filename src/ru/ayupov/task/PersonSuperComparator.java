package ru.ayupov.task;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {

        int result;

        result = p1.getName().compareTo(p2.getName());

        if (result == 0) {
            result = Integer.compare(p1.getAge(), p2.getAge());
        }

        return result;
    }
}
