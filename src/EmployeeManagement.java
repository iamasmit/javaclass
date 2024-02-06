public class EmployeeManagement {
    public static void main(String[] args) {
        System.out.println("Employee management");
        Employee emp = new Employee();

        //within same package
        emp.id = 111;
        emp.name = "sarad";
        emp.Department = "Accounts";
        emp.profession = "CA";    // all members are accessible within class
        //emp.salary = 1500;        //  private member not  accessible outside within class
        emp.showEmployee();
       // emp.raiseSalary(500);
       // emp.raiseSalary(200);


    }
}
