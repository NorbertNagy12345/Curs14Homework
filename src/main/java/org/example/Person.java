package org.example;

import lombok.Data;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Data
public class Person {

    private Integer id;
    private String name;
    private Integer age;

    public Person(String name, int age) {
        if (isNameValid(name)) {
            this.name = name;
        }
        if (isAgeValid(age)) {
            this.age = age;
        }
    }

    public boolean isNameValid(String name) {
        Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        if (name != null) {
            Matcher m = special.matcher(name);
            return !m.find();
        } else {
            return false;
        }
    }

    public boolean isAgeValid(int age) {
        return !(age < 0 || age >= 120);
    }




}
