// Demonstrate the use of a do loop

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        int number;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter a positive integer: ");
            number = scan.nextInt();
            System.out.println("You entered: " + number);
        }while (number > 0);

    }
}
