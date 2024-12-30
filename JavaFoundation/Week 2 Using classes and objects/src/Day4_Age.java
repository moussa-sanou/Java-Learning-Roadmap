// Demonstrates the use of an if statement

import java.util.Scanner;

public class Day4_Age {

    // Reads the user's age and prints comments accordingly
    public static void main(String[] args) {

        final int MINOR = 21;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");

        int age = scan.nextInt();
        System.out.println("You entered: " + age);

        if (age < MINOR)
            System.out.println("Youth is a wonderful thing. Enjoy");
        System.out.println("Age is a state of mind.");

    }
}
