package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIODemo {

    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        String src = "E:\\BCA\\IT_Training/Java.txt";
        String dest = "E:\\BCA\\IT_Training/Java.txt";
        try{
            fis = new FileInputStream(src); // open a file for read operation
            fos =  new FileOutputStream(dest); // opens a file or create for write operation
            int data;
            while ((data = fis.read()) != -1){
                fos.write(data);
            }


        }catch (FileNotFoundException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }finally {
            try{
                if(fis!= null)
                    fis.close();
                if (fos!= null)
                    fos.close();
                /* only after closing the file the contents is written to file in file system */
            }catch (IOException e){
                System.out.println(e);
            }
        }
    }
}
