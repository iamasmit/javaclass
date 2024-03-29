package javaio;


public class Employee {
    private int id;
    private  String name;
    private String position;
    private double salary;

    public Employee(){

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employee(int id, String name, String position, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  + id + ", " + name + ", " + position + ", " + salary + ";";
    }
}