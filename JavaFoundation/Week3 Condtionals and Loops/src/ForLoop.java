// Demonstrates the use of a for loop.

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {

        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number every time you are prompted");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i<3; i++){
            System.out.println("Enter a number: ");
            num = scan.nextInt();
            System.out.println("You entered the number: " + num);
        }
    }
}
