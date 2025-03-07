// Java program to implement linked list

import java.util.LinkedList;
import java.util.List;

public class linkedList {

    // Main driver method
    public static void main(String[] args) {

        // Creating a LinkedList
        LinkedList<String> Llist = new LinkedList<String>();

        // Adding elements to the linkedlist using add() method
        Llist.add("Train");
        Llist.add("Road Trip");
        Llist.add("Small");
        Llist.add("Tomato");
        Llist.add("Onion");

        // Print the LinkedList
        System.out.println(Llist);
        System.out.println();

        // Remove an element from the Linkelist.
        Llist.remove("Road Trip");
        System.out.println("The list after the remove element: "+ "\n" + Llist);
        System.out.println();

        // Modified the list
        Llist.set(0, "Lettuce");
        System.out.println("This is the new Linkedlist after the modification: "
        + "\n" + Llist);
    }
}
