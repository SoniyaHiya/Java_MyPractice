package loop;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many terms: ");
        int n = input.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {

            System.out.print(a);

            if (i < n) {
                System.out.print(", ");
            }

            int next = a + b;
            a = b;
            b = next;
        }
    }
}