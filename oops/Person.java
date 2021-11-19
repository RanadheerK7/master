package org.stackmybiz.oops;

public class Person {
    String name;
    int age;
    float height;
    boolean isPersonEmployee;

    public Person(String name, int age, float height, boolean isPersonEmployee) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.isPersonEmployee = isPersonEmployee;
    }

    public void displayPersonData() {
        System.out.println("Name:" +name + " Age:" + age + " Height:" + height + " IsPersonEmployee:" + isPersonEmployee);
    }

    public static void main(String[] args) {
        Person person = new Person("Aneesh", 28, 5.9f, true);
        person.displayPersonData();
    }
}
