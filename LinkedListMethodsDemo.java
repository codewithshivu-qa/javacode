package arraylisttolist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Arrays;

public class LinkedListMethodsDemo {
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();

        // 1. Add elements
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
        System.out.println("After add(): " + list);

        // 2. Add at index
        list.add(2, "Ruby");
        System.out.println("After add(index, element): " + list);

        // 3. AddFirst and AddLast
        list.addFirst("HTML");
        list.addLast("CSS");
        System.out.println("After addFirst & addLast: " + list);

        // 4. Get elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 3: " + list.get(3));

        // 5. Set (update)
        list.set(1, "Go");
        System.out.println("After set(): " + list);

        // 6. Remove by index and value
        list.remove(2);
        System.out.println("After remove(index): " + list);

        list.remove("Go");
        System.out.println("After remove(value): " + list);

        list.removeFirst();
        list.removeLast();
        System.out.println("After removeFirst & removeLast: " + list);

        // 7. Search
        list.add("Java");
        System.out.println("Contains Java? " + list.contains("Java"));
        System.out.println("First index of Java: " + list.indexOf("Java"));
        System.out.println("Last index of Java: " + list.lastIndexOf("Java"));

        // 8. Size and Empty check
        System.out.println("Size: " + list.size());
        System.out.println("Is empty? " + list.isEmpty());

        // 9. toArray
        Object[] arr = list.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        // 10. forEach loop
        System.out.print("forEach: ");
        for (Object e : list) {
            System.out.print(e + " ");
        }
        System.out.println();

        // 11. sort
        Collections.sort(list);
        System.out.println("Sorted: " + list);

        // 12. removeIf
        list.removeIf(e -> e.equals("Java"));
        System.out.println("After removeIf: " + list);

        // 13. replaceAll
        list.replaceAll(e -> ((String) e).toUpperCase());
        System.out.println("After replaceAll: " + list);

        // 14. clear
        list.clear();
        System.out.println("After clear(): " + list);
        System.out.println("Is empty after clear? " + list.isEmpty());

        // 15. addAll
        LinkedList newList = new LinkedList();
        newList.add(1);
        newList.add("C++");
        newList.add("Python");
        list.addAll(newList);
        System.out.println("After addAll(): " + list);


     
    }
}
