import java.net.InetAddress;
import java.net.UnknownHostException;

public class WebsiteInfoFinder {

    public static void main(String[] args) {
        String websiteUrl = "kshitiz.edu.np"; // Replace with the website URL you want to investigate

        try {
            // Get the InetAddress object for the given website URL
            InetAddress inetAddress = InetAddress.getByName(websiteUrl);

            // Print the host name (website hosting name) and IP address
            System.out.println("Website Hosting Name: " + inetAddress.getHostName());
            System.out.println("IP Address: " + inetAddress.getHostAddress());

        } catch (UnknownHostException e) {
            System.err.println("Unable to find information for the specified website: " + websiteUrl);
            e.printStackTrace();
        }
    }
}
