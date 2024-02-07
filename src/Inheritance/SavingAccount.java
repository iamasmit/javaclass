package Inheritance;

public class SavingAccount  extends Account{
    //SavingsAccount is a Account
    double min_balance;
    double interest_rate; //
    public void displaySavingsAccount(){
        showAccountDetail();
        System.out.println("Annual Interest Rate : "+ interest_rate);
    }
    @Override
    public  void withdraw(double amount){
        //override is to redefine a parent method to work differently
        //with child class object
        if (balance - min_balance>=amount){ //fund sufficient
            balance -= amount;
            System.out.println("balance withdrawn :" +amount);
            System.out.println("Remaining Balance  : "+balance);


        }else {
            System.out.println("Insufficient withdrawl balance : "+(balance-min_balance));
        }
    }

    public static void main(String[] args) {
        Account acc = new Account();
        acc.acc_no = 123456789;
        acc.name = "Suprime KC";
        acc.deposit(2000);
        acc.withdraw(3000);
        acc.showAccountDetail();

        SavingAccount sa = new SavingAccount();
        sa.acc_no = 245678913;
        sa.name = "Animal Singh";
        sa.min_balance=500;
        sa.interest_rate = 5.00;
        sa.deposit(2000);
        sa.withdraw(1000);
        sa.withdraw(1000); //not allowed
        sa.withdraw(500); //allowed
    }
}
