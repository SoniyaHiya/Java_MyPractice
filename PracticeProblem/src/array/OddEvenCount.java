package array;

import java.util.Scanner;

public class OddEvenCount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        int evenCount = 0;
        int oddCount = 0;

          System.out.print("Enter number : ");
          for (int i = 0; i < n; i++) {
          
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}