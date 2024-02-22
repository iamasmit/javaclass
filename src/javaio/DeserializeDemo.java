package javaio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    // retrieve object from serial form written in file
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(
                    new FileInputStream("D:\\emp.txt"));
            Employee emp = (Employee) ois.readObject();
            System.out.println("Employee detail :" + emp.toString());
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        } finally {
            try {
                if (ois != null)
                    ois.close();
            } catch (IOException e) {
                System.out.println("Exception : " + e.getMessage());
            }
        }
    }
}
