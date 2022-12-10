package week11_Review.PersonClass;

import java.rmi.ServerError;

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name == null) {
            System.err.println("Name can be empty or null");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.err.println("Age can not be zero or negative!!" + age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", age=" + age +
                        ", gender=" + gender;

    }

    public void eat() {
        System.out.println(" is eating. " + name);

    }

    public void drink() {
        System.out.println(" is drinking. " + name);
    }
    public void sleep() {
        System.out.println(" is sleeping. " + name);
    }
}