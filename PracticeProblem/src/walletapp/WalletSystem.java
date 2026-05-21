package walletapp;

class Wallet {

    private static int counter = 1;

    private final int id;

    private int balance;

    public Wallet() {
        this.id = counter++;
        this.balance = 0;
    }

    public Wallet(int balance) {
        this.id = counter++;
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }

    public int getId() {
        return this.id;
    }

    public int getBalance() {
        return this.balance;
    }
}

public class WalletSystem {

    public static void main(String[] args) {

        Wallet w1 = new Wallet();

        Wallet w2 = new Wallet(1000);

        w1.deposit(500);

        w2.deposit(300);
        w2.withdraw(200);

        System.out.println("Wallet ID: " + w1.getId());
        System.out.println("Balance: " + w1.getBalance());

        System.out.println();

        System.out.println("Wallet ID: " + w2.getId());
        System.out.println("Balance: " + w2.getBalance());
    }
}