import java.util.*;
public class ArrayDeque {
    public static void main(String[] args) {

                // Create an ArrayDeque
                java.util.ArrayDeque<String> arrayDeque = new java.util.ArrayDeque<>();

                // Add elements to the front of the deque
                arrayDeque.addFirst("Element 1");
                arrayDeque.addFirst("Element 2");
                arrayDeque.addFirst("Element 3");

                // Add elements to the end of the deque
                arrayDeque.addLast("Element 4");
                arrayDeque.addLast("Element 5");

                // Display the elements
                System.out.println("ArrayDeque elements: " + arrayDeque);

                // Get the first and last elements
                String firstElement = arrayDeque.getFirst();
                String lastElement = arrayDeque.getLast();
                System.out.println("First element: " + firstElement);
                System.out.println("Last element: " + lastElement);

                // Remove elements from the front and end
                arrayDeque.removeFirst();
                arrayDeque.removeLast();

                // Display the elements after removal
                System.out.println("ArrayDeque elements after removal: " + arrayDeque);

                // Check if the deque contains a specific element
                boolean containsElement = arrayDeque.contains("Element 2");
                System.out.println("Contains 'Element 2': " + containsElement);

                // Get the size of the deque
                int size = arrayDeque.size();
                System.out.println("ArrayDeque size: " + size);

                // Clear all elements from the deque
                arrayDeque.clear();
                System.out.println("ArrayDeque after clearing: " + arrayDeque);
            }
        }




