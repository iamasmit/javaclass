public class Bicycle {

    static int count;
    // count is a static variable used to count objects created
    int sn;

    String brand;

    String model;

    double price;

    public  Bicycle(){ // default constructor creates default object
        count++;      // count variable counts objects created
        sn = count;
    }
    public  void showBicycle(){
        System.out.println("------Bicycle description ------------");
        System.out.println("S.No.: "+sn);
        System.out.println("Model : "+model);
        System.out.println("Brand : " +brand);
        System.out.println("Price : " +price);
    }

    public static void main(String[] args) {
        Bicycle b1 = new Bicycle();
        b1.model = "SM200";
        b1.brand = "Santosha";
        b1.price = 2000;
        b1.showBicycle();
    }
}
