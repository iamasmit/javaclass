package Inheritance;

import java.lang.reflect.Constructor;

public class CheckedDemo {

    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("com.siris.oop.Employee");
            // Corrected the spelling mistake in the method name "grtName()" to "getName()"
            System.out.println("Class name : " + c.getName());

            Constructor<?>[] constructors = c.getConstructors();
            // Added code to get constructors and print their names
            for (Constructor<?> constructor : constructors) {
                System.out.println("Constructor: " + constructor.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
