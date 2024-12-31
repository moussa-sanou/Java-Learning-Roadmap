// Demonstrates the use of a block statement in an if-else

import java.util.Random;
import java.util.Scanner;

public class Guessing {

    // Plays a simple guessing game with the user
    public static void main(String[] args) {

        final int Max = 10;
        int answer, guess;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        answer = generator.nextInt(Max) + 1;

        System.out.println("I'm thinking of a number between 1 and " + Max + ". Guess what is it: ");
        guess = scan.nextInt();

        if (guess == answer)
            System.out.println("You got it! Good guessing! ");
        else
        {
            System.out.println("That is not correct, sorry.");
            System.out.println("The number was " + answer);
        }

    }
}
