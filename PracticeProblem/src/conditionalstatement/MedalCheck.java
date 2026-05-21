package conditionalstatement;

import java.util.Scanner;

public class MedalCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.print("Completed semester? (yes/no): ");
        String input = sc.next();

        boolean completed;

        if (input.equals("yes") || input.equals("y")) {
            completed = true;
        } 
        else {
            completed = false;
        }

        if (completed) {

            if (cgpa >= 3.5) {
                System.out.println("Congratulations! You get a MEDAL 🏅");
            } 
            else {
                System.out.println("Semester completed but no medal.");
            }

        } 
        else {
            System.out.println("You have not completed the semester.");
        }

        sc.close();
    }
}