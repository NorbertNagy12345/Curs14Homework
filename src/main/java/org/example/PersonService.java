package org.example;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    List<Person> personList = new ArrayList<>();
    private static int count = 1;

    public void addPerson(Person person) {
        person.setId(count);
        count++;
        personList.add(person);
    }

    public List<Person> removePerson(int id) {
        List<Person> newPersonsList = new ArrayList<>();
        for (Person person : personList) {
            if (!person.getId().equals(id)) {
                newPersonsList.add(person);
            }
        }
        return newPersonsList;
    }

    public List<Person> getAllPersons() {
        return personList;
    }

    public List<Person> getPersonsOlderThan(int age) {
        List<Person> newPersonsList = new ArrayList<>();
        for (Person person : personList) {
            if (person.getAge() > age) {
                newPersonsList.add(person);
            }
        }
        return newPersonsList;
    }

    public List<String> getAllPersonsNames() {
        List<String> names = new ArrayList<>();
        for (Person person : personList) {
            names.add(person.getName());
        }
        return names;
    }

    public Person getPersonByName(String name) {
        for (Person person : personList) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    public Person getPersonById(int id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }
}
