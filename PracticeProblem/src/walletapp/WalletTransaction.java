package walletapp;

class Wallet {

    private static int counter = 1;

    private final int id;

    private double balance;

    private String lastWithdrawMode;

    public Wallet() {
        this.id = counter++;
        this.balance = 0;
        this.lastWithdrawMode = "None";
    }

    public Wallet(double balance) {
        this.id = counter++;
        this.balance = balance;
        this.lastWithdrawMode = "None";
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
        this.lastWithdrawMode = "NORMAL";
    }

    public void withdraw(double amount, String mode) {
        this.balance -= amount;
        this.lastWithdrawMode = mode;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getLastWithdrawMode() {
        return this.lastWithdrawMode;
    }
}

public class WalletTransaction {

    public static void main(String[] args) {

        Wallet w1 = new Wallet(2000);

        w1.deposit(500);
        w1.withdraw(300);
        w1.withdraw(200, "ATM");

        System.out.println("Wallet ID: " + w1.getId());
        System.out.println("Balance: " + w1.getBalance());
        System.out.println("Last Withdraw Mode: " + w1.getLastWithdrawMode());
    }
}