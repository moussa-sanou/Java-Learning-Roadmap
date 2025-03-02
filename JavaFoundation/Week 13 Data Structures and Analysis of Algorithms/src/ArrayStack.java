// Demonstrate the use of array stack implementation.

public class ArrayStack {

    private int maxSize; // Maximum capacity of the stack
    private int[] stackArray;
    private int top; // Index of the top element

    // Constructor to initialize the stack with a given size
    public ArrayStack(int size)
    {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Stack is initially empty
    }

    // Push an element onto the stack
    public void push(int value)
    {
        if (isFull())
        {
            throw new IllegalStateException("Stack is full. cannot push " + value);
        }
        stackArray[++top] = value; // Increment to first, then insert
    }

    // Pop and return the top element from the stack
    public int pop()
    {
        if (isEmpty())
        {
            throw new IllegalStateException("Stack is empty.");
        }
        return stackArray[top--]; // Return to element, then decrement top
    }


}
