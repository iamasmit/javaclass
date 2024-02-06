public class StudentTest {


    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        Student.university = "TU";
        s1.rollNo = 33444;
        s2.rollNo = 3443;
        s1.name = "Rishan";
        s2.name = "Asmit";
        s1.address = "Morang";
        s2.address = "Belbari";
        s1.subject = "Java";
        s2.subject = "Dotnet";

        s1.showStudent();
        s2.showStudent();

    }
}