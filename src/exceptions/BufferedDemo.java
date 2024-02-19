package exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDemo {
    // Buffered technique allows us to read and write data in bulk
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader("E:\\BCA\\IT_Training/Java.txt"));
            bw = new BufferedWriter(new FileWriter("E:\\BCA\\IT_Training/Javaaa.txt",true));

            String line = br.readLine();
            while (line != null) {
                bw.write(line);
                bw.newLine(); // Add newline after each line if needed
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Exception : " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
                if (bw != null) bw.close();
            } catch (IOException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }
}
