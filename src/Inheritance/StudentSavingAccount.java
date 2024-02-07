package Inheritance;

public class StudentSavingAccount extends SavingAccount {
    public StudentSavingAccount(){
        super(); //super() refers to parent class consyructor
        //parent must be initialized first before initializing
        min_balance = 0;
        interest_rate = 4;
    }
    public StudentSavingAccount(long acc_no, String name, double balance, double min_balance, double interest_rate){

    }
}
