package conditionalstatement;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 0 && marks <= 39) {
            System.out.println("Grade: F");
        } 
        else if (marks <= 59) {
            System.out.println("Grade: C+");
        } 
        else if (marks <= 69) {
            System.out.println("Grade: B");
        } 
        else if (marks <= 79) {
            System.out.println("Grade: A-");
        } 
        else if (marks <= 89) {
            System.out.println("Grade: A");
        } 
        else if (marks <= 100) {
            System.out.println("Grade: A+");
        } 
        else {
            System.out.println("Invalid marks!");
        }

        sc.close();
    }
}