package org.stackmybiz.object;

import java.util.LinkedHashSet;

public class Person {
    private String personName;
    private int personAge;

    public Person(String personName, int personAge) {
        this.personName = personName;
        this.personAge = personAge;
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        return this.personName.equals(person.personName) && this.personAge == person.personAge;
    }

    @Override
    public String toString() {
        return "Person Name:" + this.personName + " Age:" + this.personAge;
    }

    @Override
    public int hashCode() {
        return this.personAge;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Ranadheer", 27);
        Person person2 = new Person("Ranadheer", 27);
        System.out.println(person1.equals(person2));
        System.out.println(person1);

        LinkedHashSet<Person> persons = new LinkedHashSet<>();
        persons.add(new Person("Rohith", 27));
        persons.add(new Person("Ranjith", 28));
        persons.add(new Person("Rohith", 27));
        persons.add(new Person("Mahesh", 26));

        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
