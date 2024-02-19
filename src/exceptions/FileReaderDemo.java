package exceptions;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {
    // FileReader and FileWriter are used to work with character-based files
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("E:\\BCA\\IT_Training/Java.txt");
            fw = new FileWriter("E:\\BCA\\IT_Training/Java.txt");
            char[] ch = new char[1024];
            int bytesRead;
            while ((bytesRead = fr.read(ch, 0, 1024)) != -1) {
                fw.write(ch, 0, bytesRead);
            }
            fw.write("\r\n");

        } catch (IOException e) {
            System.out.println("Exception occurs : " + e.getMessage());
        } finally {
            try {
                if (fr != null) fr.close();
                if (fw != null) fw.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
