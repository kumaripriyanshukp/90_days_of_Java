// Program to show bank account structure using encapsulations
public class BankAccount {
    public BankAccount(String priyanshu, int i) {
    }

    public static void main(String[] args) {
        BankAcc acc = new BankAcc("Priyanshu", 1000);

        acc.deposit(500);
        acc.withdraw(300);
        acc.withdraw(1500);
        acc.displayBalance();
    }
}
class BankAcc{
    private String accountHolder;
    private double balance;

    // Constructor
    BankAcc(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Display balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
