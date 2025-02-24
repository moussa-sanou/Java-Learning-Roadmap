/* In java a list is an ordered collection (sequence) that allows duplicate elements. */

import java.util.ArrayList;
import java.util.List;

public class List1 {

    public static void main(String[] args) {
        // Create a List of strings using ArrayList
        List<String> fruits = new ArrayList<>();

        // 1. Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Initial list: " + fruits);

        // Add element at specific index
        fruits.add(1, "Mango");
        System.out.println("After adding Mango at index 1: " + fruits);

        // Access element index
        String fruit = fruits.get(2);
        System.out.println("Element at index 2: " + fruit);
    }
}
