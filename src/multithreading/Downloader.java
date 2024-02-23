package multithreading;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class Downloader implements Runnable {
    @Override
    public void run() {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            URL url = new URL("https://www.rcsdk12.org/cms/lib/NY01001156/Centricity/Domain/4951/Head_First_Java_Second_Edition.pdf");
            URLConnection connection = url.openConnection();
            bis = new BufferedInputStream(connection.getInputStream());
            bos = new BufferedOutputStream(new FileOutputStream("D:\\Head_First_Java_Second_Edition.pdf"));

            byte[] data = new byte[1024];
            int bytesRead;
            int totalBytesRead = 0;

            while ((bytesRead = bis.read(data, 0, 1024)) != -1) {
                bos.write(data, 0, bytesRead);
                totalBytesRead += bytesRead;
                System.out.println("Downloaded KB: " + totalBytesRead / 1024);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bis != null) bis.close();
                if (bos != null) bos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Downloader downloader = new Downloader();
        Thread t1 = new Thread(downloader);
        t1.start();
    }
}
