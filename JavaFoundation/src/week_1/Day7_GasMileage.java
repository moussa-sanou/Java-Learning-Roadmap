package week_1;

// Demonstrates the use of the scanner class to read numeric data

import java.util.Scanner;

public class Day7_GasMileage {

    /* Calculates fuel efficiency based on value entered by the user */
    public static void main(String[] args) {

        int miles;
        double gallons, mpg;
        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter the number of miles: ");
        miles = scan.nextInt();

        System.out.println(" Enter the gallons of fuel used: ");
        gallons = scan.nextDouble();

        mpg = miles / gallons;

        System.out.println(" Miles Per Gallon: " + miles);
    }
}
