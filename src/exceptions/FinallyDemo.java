package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyDemo {
    public static void main(String[] args) {
        // finally block is used when working with resources
        FileInputStream fis = null;
        try{
            //ope a file
            fis = new FileInputStream("E:\\BCA\\IT_Training/Java.txt");
            // read from file and display
            int i;
            while ((i = fis.read()) !=-1){ //-1 is an end of stream value
                // read until we reach the end of stream
                System.out.print((char) i);

            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            try{
                if (fis != null)
                    fis.close(); //close file
            }catch (IOException e){
                System.out.println(e);
            }
        }
    }
}
