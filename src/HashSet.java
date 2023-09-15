import java.util.*;
public class HashSet {
    public static void main(String[] args) {

                // Create a HashSet
                java.util.HashSet<String> hashSet = new java.util.HashSet<>();

                // Add elements to the HashSet
                hashSet.add("Apple");
                hashSet.add("Banana");
                hashSet.add("Orange");
                hashSet.add("Grapes");
                hashSet.add("Kiwi");

                // Display the elements
                System.out.println("HashSet elements: " + hashSet);

                // Check if the HashSet contains a specific element
                boolean containsElement = hashSet.contains("Banana");
                System.out.println("Contains 'Banana': " + containsElement);

                // Remove an element from the HashSet
                hashSet.remove("Orange");

                // Display the elements after removal
                System.out.println("HashSet elements after removal: " + hashSet);

                // Get the size of the HashSet
                int size = hashSet.size();
                System.out.println("HashSet size: " + size);

                // Clear all elements from the HashSet
                hashSet.clear();
                System.out.println("HashSet after clearing: " + hashSet);
            }
        }
