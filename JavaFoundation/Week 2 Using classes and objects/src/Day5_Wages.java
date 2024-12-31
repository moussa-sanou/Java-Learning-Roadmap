// Demonstrates the use of an if-else statement.

import java.util.Scanner;

public class Day5_Wages {

    // Reads the number of hours worked and calculates wages.
    public static void main(String[] args) {

        final double RATE = 8.25; // regular pay rate
        final int STANDARD = 40;  // standard hours in a work week

        Scanner scan = new Scanner(System.in);
        double pay = 0.0;

        System.out.println("Enter the number of hours worked: ");
        int hours = scan.nextInt();

        System.out.println();

        // Pay overtime at "time and a half"
        if (hours > STANDARD)
            pay = STANDARD * RATE + (hours - STANDARD) * (RATE * 1.5);
        else
            pay = hours * RATE;

            System.out.println("Gross earnings: " + pay);
    }
}
