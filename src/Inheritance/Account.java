package Inheritance;

public class Account {
    public long acc_no;
    public String name;
    public double balance;
    public static String bank;

    public void deposit(double amount){
        balance += amount;
        System.out.println("Amount deposited " +amount);
    }

    public void withdraw(double amount){
        balance -= amount;
        System.out.println("Amount withdrawn : "+amount);
        System.out.println("Your remaining balance is " +balance);
    }
    public void showAccountDetail(){
        System.out.println("------Welcome to "+bank+"-------");
        System.out.println("Account No: "+ acc_no);
        System.out.println("Name : "+name);
        System.out.println("Balance : " +balance);
    }
}
