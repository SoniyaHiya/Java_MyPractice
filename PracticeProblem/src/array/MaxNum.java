package array;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers: ");
        int n = input.nextInt();

        int[] arr = new int[n];

         System.out.print("Enter number : ");
        for (int i = 0; i < n; i++) {
           
            arr[i] = input.nextInt();
        }

        int greatest = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > greatest) {
                greatest = arr[i];
            }
        }

        System.out.println("Greatest number is: " + greatest);
    }
}