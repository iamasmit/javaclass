public class College {
    // Instance variables
    int code;
    String name;
    String address;

    // Class variable (static)
    static String university;

    // Constructor
    public College() {
        // You can initialize instance variables or leave it empty
    }

    // Method to display college information
    public void showCollege() {
        System.out.println("College Code: " + code);
        System.out.println("College Name: " + name);
        System.out.println("College Address: " + address);
        System.out.println("University: " + university);
        System.out.println("------------------------");
    }
}
