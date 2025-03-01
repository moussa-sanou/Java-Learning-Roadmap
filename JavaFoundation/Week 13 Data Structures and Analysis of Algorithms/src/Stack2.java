/* In java stack is the linear data structure that follows the LIFO principle. Java
* provides built-in support for stacks through the stack. */

// Create a stack taking string elements
import java.util.Stack;

public class Stack2 {

    public static void main(String[] args) {

        // Instantiate the stack
        Stack<String> s2 = new Stack<>();

        // Peek at the stack before adding elements
        //System.out.println("This is the look at the stack before adding elements: " + s2.peek());

        // Push elements into the stack
        s2.push("Sami");
        s2.push("Gold");
        s2.push("Cacao");

        System.out.println();

        System.out.println("Here is our stack after pushing elements: " + s2);
        System.out.println();

        // Peek at top element
        System.out.println("Element at the top of the stack: " + s2.peek());
        System.out.println();

        // Check if the stack is empty
        System.out.println("Is this stack empty: " + s2.isEmpty());
        System.out.println();

        // Search element within the stack
        System.out.println("Search gold in this stack: " + s2.search("Gold"));
        System.out.println();

        // Pop top element from the top of the stack
        System.out.println("The top element pop from the stack is: " + s2.pop());


    }
}
