package javaio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    //ObjectOutputStream is used to serialize object and
    //write that object into a file
    public static void main(String[] args) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream( new FileOutputStream("D:\\emp.txt"));
            Employee emp = new Employee(11," Arun Kumar Chaudhary", "SEO", 1200);
            oos.writeObject(emp);

        }catch (IOException e){
            System.out.println("Exception : "+e.getMessage());
        }finally {
            try {
                if (oos!=null)
                    oos.close();
            }catch (IOException e){
                System.out.println("Exception : " +e.getMessage());
            }
        }
    }
}
