public class CollegeTest {
    public static void main(String[] args) {
        College c1 = new College();
        College c2  = new College();

        College.university = "TU";
        c1.code = 23423;
        c2.code = 53222;
        c1.name = "KMC";
        c2.name ="MMC";
        c1.address ="Bagbazar";
        c2.address = "Baneshwor";

        c1.showCollege();
        c2.showCollege();
    }

}
