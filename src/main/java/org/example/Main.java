package org.example;

public class Main {
    public static void main(String[] args) {
        Person person =new Person("Mihai",33);
        Person person1 =new Person("Niki",23);
        Person person2 =new Person("Hanna",22);
        Person person3 =new Person("Vlad",24);
        Person person4 =new Person("Nicu",22);
      PersonService personService = new PersonService();
      personService.addPerson(person);
      personService.addPerson(person1);
      personService.addPerson(person2);
      personService.addPerson(person3);
      personService.addPerson(person4);

        System.out.println(personService.getAllPersons().get(0));
        System.out.println(personService.getAllPersons().get(1));
    }


}