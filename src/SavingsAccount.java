public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // Set annual interest rate to 4%
        SavingsAccount.modifyInterestRate(0.04);

        // Calculate and print the new balances for both savers
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Month 1 - Saver 1 Balance: $" + saver1.getSavingsBalance());
        System.out.println("Month 1 - Saver 2 Balance: $" + saver2.getSavingsBalance());

        // Set annual interest rate to 5%
        SavingsAccount.modifyInterestRate(0.05);

        // Calculate and print the new balances for both savers for the next month
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Month 2 - Saver 1 Balance: $" + saver1.getSavingsBalance());
        System.out.println("Month 2 - Saver 2 Balance: $" + saver2.getSavingsBalance());
    }
}
