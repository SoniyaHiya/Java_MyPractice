package conditionalstatement;

import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sales percentage: ");
        int sales = sc.nextInt();

        System.out.print("Enter attendance percentage: ");
        int attendance = sc.nextInt();

        int bonus;

        if (sales >= 95) {

            if (attendance == 100) {
                bonus = 60;
            } 
            else if (attendance == 90) {
                bonus = 40;
            } 
            else {
                bonus = 5;
            }

        } 
        else if (sales >= 80) {

            if (attendance == 100) {
                bonus = 40;
            } 
            else if (attendance == 90) {
                bonus = 20;
            } 
            else {
                bonus = 5;
            }

        } 
        else {
            bonus = 5;
        }

        System.out.println("Bonus: " + bonus + "%");

        sc.close();
    }
}