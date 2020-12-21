package org.example;

import org.example.model.Person;

public class App{

    public static void main( String[] args )
    {
        Person person = new Person();
        person.setFirstName("Anna");
        person.setLastName("Ward");
        person.setAge(29);

        System.out.println("personInformation: ");
        System.out.println(person.toString());

    }
}
