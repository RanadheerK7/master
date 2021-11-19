package org.stackmybiz.oops;

public class PersonWithSetterGetter {
    String name;
    int age;
    float height;
    boolean isPersonEmployee;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isPersonEmployee() {
        return isPersonEmployee;
    }

    public void setPersonEmployee(boolean personEmployee) {
        isPersonEmployee = personEmployee;
    }

    public static void main(String[] args) {
        PersonWithSetterGetter person = new PersonWithSetterGetter();
        person.setName("Mahipal");
        person.setAge(27);
        person.setHeight(5.9f);
        person.setPersonEmployee(true);

        System.out.println("Name:" + person.getName() + " Age:" + person.getAge() + " Height:" + person.getHeight()
                + " isPersonEmployee:" + person.isPersonEmployee());

    }
}
