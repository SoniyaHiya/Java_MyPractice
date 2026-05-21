package walletapp;

class Wallet {

    private int balance;

    
    public Wallet(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    // withdraw method
    public void withdraw(int amount) {
        this.balance = this.balance - amount;
    }

    public int getBalance() {
        return this.balance;
    }
}

public class WalletApp {

    public static void main(String[] args) {

        Wallet member1 = new Wallet(1000);
        Wallet member2 = new Wallet(500);

        member1.deposit(300);
        member1.withdraw(200);

        member2.deposit(1000);
        member2.withdraw(150);


        System.out.println("Final Balance of Member 1: " + member1.getBalance());
        System.out.println("Final Balance of Member 2: " + member2.getBalance());
    }
}