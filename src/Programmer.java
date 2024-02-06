public class Programmer extends Employee {

    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.id = 122;
        p.name = "Sabin";
        p.Department = "IT"; // protected member accessible through subclass

        p.showEmployee();

        Employee emp = new Employee();

        emp.id = 111;
        emp.name = "Hello";


    }
}
