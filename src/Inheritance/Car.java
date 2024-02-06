package Inheritance;

public class Car {
    public  int seat_capacity;
    public String model;
    public String brand;
    public final Engine e;
    //one-to-one relation between car and object
    //final keyword is used to make strong relation
    //'"    " enforces a car must have an engine


    public Car(){
        e=new Engine(1800,160,"Mitsubishu");
        //car is provided an engine during car construction
        //thus creating a strong relation between car and engine object
    }

    public Car(int seat_capacity, String model, String brand, Engine e) {
        this.seat_capacity = seat_capacity;
        this.model = model;
        this.brand = brand;
        this.e = e;
    }

    public static void main(String[] args) {
        Car c1=new Car();
        c1.e.showEngine();

        Engine eg=new Engine(50,121,"Toyota");
        Car c2=new Car(7,"TP1200","Rolls Royace",eg);
        c2.e.showEngine();
    }
}