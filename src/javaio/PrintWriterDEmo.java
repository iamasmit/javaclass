package javaio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterDEmo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //take console input and save the information in a csv file
        System.out.println("Enter employee details: ");
        PrintWriter pw= null;
        try{
            pw=new PrintWriter(new FileWriter("d://employee.csv",true));
            Employee emp=new Employee();
            System.out.println("Enter Employee Id:");
            emp.setId(sc.nextInt());
            System.out.println("Enter Employee name: ");
            sc.nextLine();
            emp.setName(sc.nextLine());
            System.out.println("ENter Employee position: ");
            emp.setPosition(sc.nextLine());
            System.out.println("Enter employee salary:");
            emp.setSalary(sc.nextDouble());

            pw.println(emp.toString());

        }catch (IOException e){
            System.out.println("Exception: "+e.getMessage());
        }finally {
            {
                if(pw!=null)
                    pw.close();
            }
        }
    }
}
