package org.example;

import org.example.model.Person;

public class App{

    public static void main( String[] args )
    {
        Person person = new Person("Aman","Adam","test",29,"Swedish");

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());




       /* Person person = new Person();
        person.setFirstName("Anna");
        person.setLastName("Ward");
        person.setAge(29);

        System.out.println("personInformation: ");
        System.out.println(person.toString());

        */

    }
}
