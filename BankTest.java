class BankAccount {
    private int accountNumber;
    private double balance;
    static int count = 0;
    final int accountId;
    BankAccount(int accNo, double bal) {
        accountNumber = accNo;
        balance = bal;

        count++;
        accountId = count;
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited");
        } else {
            System.out.println("Invalid deposit");
        }
    }
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("Amount withdrawn");
        }
    }
    double getBalance() {
        return balance;
    }
}
class BankTest {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(101, 5000);
        b1.deposit(2000);
        b1.withdraw(1000);
        System.out.println("Balance: " + b1.getBalance());
        System.out.println("Account ID: " + b1.accountId);
        System.out.println("Total accounts: " + BankAccount.count);
    }
}