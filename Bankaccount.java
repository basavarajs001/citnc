
import java.util.Scanner;

public class Bankaccount {
    String account_holder_name;
    double balance;

    Bankaccount(String name, double amount) {
        account_holder_name = name;
        balance = amount;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double amount = sc.nextDouble();

        Bankaccount b = new Bankaccount(name, amount);

        System.out.println("\nAccount Holder: " + b.account_holder_name);

        System.out.print("Enter Deposit Amount: ");
        b.deposit(sc.nextDouble());

        System.out.print("Enter Withdrawal Amount: ");
        b.withdraw(sc.nextDouble());

        b.checkBalance();

        sc.close();
    }
}
