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

    // Return the top element without removing it.
    public int peek()
    {
        if (isEmpty())
        {
            throw new IllegalStateException("Stack is empty.");
        }
        return stackArray[top];
    }

    // Check if the stack is empty
    public boolean isEmpty()
    {
        return (top == -1);
    }

    // Check if the stack is full
    public boolean isFull()
    {
        return (top == maxSize - 1);
    }

    // Get the current size of the stack
    public int size()
    {
        return top + 1;
    }

    // Example usage
    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(3);

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());  // 30


    }


}
