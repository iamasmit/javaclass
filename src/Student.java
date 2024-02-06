public class Student {

    public int rollNo;  //variable

    public String name;

    public String address;

    public String subject;

    public static String university;


    public void showStudent(){   //method
        System.out.println("College code:" + rollNo);
        System.out.println("Name:" + name);
        System.out.println("Address:" + address);
        System.out.println("Subject: " + subject);
        System.out.println("University: " + university);
    }

}