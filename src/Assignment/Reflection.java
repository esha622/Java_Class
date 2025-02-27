package Assignment;

import java.lang.reflect.Field;

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Reflection {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        Class<?> personClass = person.getClass();

        System.out.println("Fields of class: " + personClass.getName());
        Field[] fields = personClass.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            try {
                System.out.println(field.getName() + ": " + field.get(person));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}