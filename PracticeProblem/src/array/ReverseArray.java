package array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter number : ");
        for (int i = 0; i < n; i++)
        {
                    arr[i] = input.nextInt();
        }

        System.out.println("Reverse order:");

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}