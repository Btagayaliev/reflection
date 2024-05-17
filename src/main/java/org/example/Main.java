package org.example;

import java.lang.reflect.Field;


public class Main {
    public static void main(String[] args) {
        try {
            Class<Cat> catClass = Cat.class;
            Cat cat = catClass.getDeclaredConstructor().newInstance();

            Field nameField = catClass.getDeclaredField("name");
            nameField.setAccessible(true);
            nameField.set(cat, "Koshka");

            Field ageField = catClass.getDeclaredField("age");
            ageField.setAccessible(true);
            ageField.set(cat, 2);

            Field feetField = catClass.getDeclaredField("feet");
            feetField.setAccessible(true);
            feetField.set(cat, 4);
            
        } catch (Exception exc) {
            exc.printStackTrace();
        }

    }
}

class Cat {
    private String name;
    private int age;

    private int feet;
}
