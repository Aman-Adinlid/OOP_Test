package org.example.model;

public class Person {

    private String firstName;
    private String lastName;
    private  String email;
    private int age;
    private String nationality;

    public Person(String firstName, String lastName,String email, int age, String nationality){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.nationality = nationality;
    }


public String getFirstName(){

    return firstName;
}
public void setFirstName(String firstName){

    this.firstName = firstName;
}
public String getLastName(){
    return lastName;
}
public void setLastName(String lastName){
    this.lastName = lastName;
}

public int getAge(){
    return age;
}
public void setAge(int Age){
    this.age = age;
}
public String getNationality(){
    return getNationality();
}
public void setNationality(){
    this.nationality = nationality;
}

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", status=" + nationality +
                '}';
    }
}
