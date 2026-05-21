package walletapp;

class Wallet {

    // unique id counter
    private static int counter = 1;

    // final id
    private final int id;

    // private balance
    private double balance;

    // constructor
    public Wallet(double balance) {
        this.id = counter++;
        this.balance = balance;
    }

    // deposit method
    public void deposit(double amount) {
        this.balance += amount;
    }

    // getter for id
    public int getId() {
        return this.id;
    }

    // getter for balance
    public double getBalance() {
        return this.balance;
    }
}

// utility class
class WalletUtility {

    // add bonus using wallet reference
    public static void addBonus(Wallet w, double amount) {
        w.deposit(amount);
    }

    // try to swap wallet references
    public static void swapWallet(Wallet w1, Wallet w2) {

        Wallet temp = w1;
        w1 = w2;
        w2 = temp;

        System.out.println("\nInside swapWallet() method:");
        System.out.println("w1 ID: " + w1.getId());
        System.out.println("w2 ID: " + w2.getId());
    }
}

public class WalletUtilityTest {

    public static void main(String[] args) {

        Wallet wallet1 = new Wallet(1000);
        Wallet wallet2 = new Wallet(2000);

        // before bonus
        System.out.println("Before Bonus:");
        System.out.println("Wallet1 Balance: " + wallet1.getBalance());

        // add bonus
        WalletUtility.addBonus(wallet1, 500);

        // after bonus
        System.out.println("\nAfter Bonus:");
        System.out.println("Wallet1 Balance: " + wallet1.getBalance());

        // before swap
        System.out.println("\nBefore Swap:");
        System.out.println("wallet1 ID: " + wallet1.getId());
        System.out.println("wallet2 ID: " + wallet2.getId());

        // try swapping
        WalletUtility.swapWallet(wallet1, wallet2);

        // after swap attempt
        System.out.println("\nAfter Swap Attempt in main():");
        System.out.println("wallet1 ID: " + wallet1.getId());
        System.out.println("wallet2 ID: " + wallet2.getId());
    }
}