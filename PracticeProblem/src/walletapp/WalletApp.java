package walletapp;

public class WalletApp {

    public static int deposit(int balance, int amount) {
        return balance + amount;
    }

    
    public static int withdraw(int balance, int amount) {
        return balance - amount;
    }

    public static void main(String[] args) {

        int balance_1 = 1000;
        int balance_2 = 500;

        balance_1 = deposit(balance_1, 300);
        balance_1 = withdraw(balance_1, 200);

        balance_2 = deposit(balance_2, 1000);
        balance_2 = withdraw(balance_2, 150);

        System.out.println("Final Balance of Wallet 1: " + balance_1);
        System.out.println("Final Balance of Wallet 2: " + balance_2);
    }
}