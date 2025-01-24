import java.util.Scanner;

public class TimesTen2 {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter an integer: ");

            int number = scan.nextInt();

            // Got here if user entered good data
            System.out.println(number * 10);
        }
        catch (NumberFormatException e){
            // got here if user entered bad data
            System.out.println("That was not a number");
        }
    }
}
