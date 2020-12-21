package org.example.model;

public class Person {

    private String firstName;
    private String lastName;
    private  String email;
    private int age;
    private boolean status;

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
public String getStatus(){
    return getStatus();
}
public void setStatus(){
    this.status = status;
}

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", status=" + status +
                '}';
    }
}
