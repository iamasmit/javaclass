public class Date {

    int year, month, day;

    public void showData(){
        System.out.printf("%2d/%2d/%4d\n"  ,month, day, year);
    }

    public boolean compareDate(Date d){
        if(month >=d.month && day >=d.day){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Date dob_suresh = new Date();
        dob_suresh.year = 1999;
        dob_suresh.month = 5 ;
        dob_suresh.day = 15;

        Date dob_prabhat = new Date();
        dob_prabhat.year = 2001;
        dob_prabhat.month = 9;
        dob_prabhat.day = 27;

        if(dob_prabhat.compareDate(dob_suresh)){
            System.out.println("Prabhats birthday comes latter than suresh");
        }
        else {
            System.out.println("Suresh Birthday comes before suresh");
        }
    }
}
