
public class RecursionExamples {

    // 1. Recursive method to calculate factorial of a number
    public static int factorial(int n)
    {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1){
            return 1;
        }
        // Recursive case: n! = n * (n-1)
        return n * factorial(n -1);
    }

    // 2. Recursive method to compute the nth Fibonacci number
    public static int fibonacci(int n)
    {
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        // Recursive case: Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
        return fibonacci(n -1) + fibonacci(n - 2);
    }

    // 3.Recursive method to find the sum of digits of a number
    public static int sumOfDigits(int number)
    {
        // Base case: if the number is a single digit, return the number itself
        if (number < 10){
            return number;
        }
        // Recursive case: sum = last digit + sum of digits of the remaining itself
        return (number % 10) + sumOfDigits(number / 10);
    }


    // Main method to test the recursive functions
    public static void main(String[] args) {

        // Test factorial
        int num = 5;
        System.out.println("Factorial of " + num + " is: " + factorial(num));

        // Test Fibonacci
        int fibNum = 6;
        System.out.println("Fibonacci number at position " + fibNum + " is: " + fibonacci(fibNum));

        // Test sum of digits
        int number = 1234;
        System.out.println("Sum of digits of " + number + " is: " + sumOfDigits(number));


    }
}
