package multithreading;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Downloader implements Runnable {
    @Override
    public void run() {
        // This thread runs a file or program from the internet
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            URL url = new URL("");
            URLConnection connection = url.openConnection();
             bis = new BufferedInputStream(connection.getInputStream());
             bos = new BufferedOutputStream(new FileOutputStream("D:\\emp.txt" +url.getFile()));
            byte[] data = new byte[1024];
            while (bis.read(data, 0, 1024) !=-1){
                bos.write(data,0,1024);
                int count =0;
                System.out.println("Downloaded KB:" + ++count);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (bis!=null) bis.close();
                if (bos!= null) bos.close();
            }catch (IOException e) {
                throw new RuntimeException(e);
        }

        }

    }
}
