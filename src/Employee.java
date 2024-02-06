import javax.sound.midi.Soundbank;
import java.net.Socket;

public class Employee {
    public int id;
    public String name;
    protected String Department;
    String profession; //Default access

    private int salary;

    public void showEmployee(){
        System.out.println("Name : " +name);
        System.out.println("department : " + Department);
        System.out.println("Profession : " +profession);
        System.out.println("Salary : " +salary);
    }

    private void raiseSalary(double raiseAmount){
        salary += raiseAmount;
    }
    public static void main(String[] args){
        System.out.println("Employee management");
        Employee emp = new Employee();

        emp.id = 111;
        emp.name = "sarad";
        emp.Department = "Accounts";
        emp.profession = "CA";    // all members are accessible within class
        emp.salary = 1500;        //  private member accessible only within class
        emp.showEmployee();
        emp.raiseSalary(500);
        emp.raiseSalary(200);

    }
}
