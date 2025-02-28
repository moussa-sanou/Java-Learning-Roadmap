// Java program Implementing stack class

import java.util.Stack;

public class Stack1 {

    public static void main(String[] args) {

        // Create a new stack
        Stack<Integer> s = new Stack<>();

        // Create another stack with string
        Stack<String> s2 = new Stack<>();

        // Push elements from the stack
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);


        // Peek at the element on top of the stack
        System.out.println(s.peek());

        System.out.println("----------------");

        // Pop elements from the stack
        while (!s.isEmpty())
        {
            System.out.println(s.pop());
        }

    }
}
