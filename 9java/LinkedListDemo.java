import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Example: Add an element at index 2
        list.add(2, "Mango"); // Adds "Mango" at index 2
        System.out.println("After adding 'Mango' at index 2: " + list);

        // Example: Update (set) the element at index 1
        list.set(1, "Orange"); // Updates index 1 to "Orange"
        System.out.println("After updating index 1 to 'Orange': " + list);

        System.out.println("LinkedList elements (using Iterator):");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Alternatively, you can use a for-each loop:
        // for (String fruit : list) {
        //     System.out.println(fruit);
        // }
    }
}
