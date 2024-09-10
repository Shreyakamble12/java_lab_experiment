
import java.util.Scanner;

public class SavingsAccount 
{
    private double savingsBalance;
    private static double annualInterestRate;

    public SavingsAccount(double balance)
    {
        this.savingsBalance = balance;
    }

    public void calculateMonthlyInterest() 
    {
        double monthlyInterest = (savingsBalance * annualInterestRate / 12) / 100;
        savingsBalance += monthlyInterest;
    }

    public void printSavingsBalance() 
    {
        System.out.printf("Savings Balance: Rs %.2f%n", savingsBalance);
    }

    public static void modifyInterestRate(double newRate) 
    {
        annualInterestRate = newRate;
    }

    public static void main(String[] args) 
    {
        // Create two SavingsAccount objects
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // Set annual interest rate to 4%
        SavingsAccount.modifyInterestRate(4.0);
        
        // Calculate and print monthly interest for the first time
        System.out.println("Balances with 4% interest rate:");
        saver1.calculateMonthlyInterest();
        saver1.printSavingsBalance();
        saver2.calculateMonthlyInterest();
        saver2.printSavingsBalance();

        // Set annual interest rate to 5%
        SavingsAccount.modifyInterestRate(5.0);

        // Calculate and print monthly interest for the second time
        System.out.println("Balances with 5% interest rate:");
        saver1.calculateMonthlyInterest();
        saver1.printSavingsBalance();
        saver2.calculateMonthlyInterest();
        saver2.printSavingsBalance();
    }
}
