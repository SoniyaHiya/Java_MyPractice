package conditionalstatement;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number a: ");
        int a = scan.nextInt();

        System.out.print("Enter second number b: ");
        int b = scan.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char ch = scan.next().charAt(0);

        if (ch == '+') {
            System.out.println("Result: " + (a + b));
        } 
        else if (ch == '-') {
            System.out.println("Result: " + (a - b));
        } 
        else if (ch == '*') {
            System.out.println("Result: " + (a * b));
        } 
        else if (ch == '/') 
        {
            if (b != 0) 
            {
                System.out.println("Result: " + (a / b));
            } 
            else 
            {
                System.out.println("Error: Division by zero!");
            }
        } 
        else 
        {
            System.out.println("Invalid operator!");
        }

        scan.close();
    }
}