package arraylisttolist;
import java.util.*;

public class ArrayListMethodsDemo 
{
    public static void main(String[] args) 
    {
        // Create ArrayList
    	ArrayList<String> list = new ArrayList<>();


        // 1. Add elements
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
        System.out.println(list);

        // 2. Add at specific index
        list.add(2, "Ruby");
        System.out.println( list);

        // 3. Get element
        System.out.println(list.get(3));

        // 4. Set element (update)
        list.set(1, "Go");
        System.out.println(list);

        // 5. Remove by index
        list.remove(2);
        System.out.println(list);

        // 6. Remove by value
        list.remove("Go");
        System.out.println(list);

        // 7. Contains check
        System.out.println("Contains Java? " + list.contains("Java"));

        // 8. IndexOf and LastIndexOf
        list.add("Java");
        System.out.println("List with duplicate Java: " + list);
        System.out.println("First index of Java: " + list.indexOf("Java"));
        System.out.println("Last index of Java: " + list.lastIndexOf("Java"));

        // 9. Size of list
        System.out.println("Size: " + list.size());

        // 10. isEmpty()
        System.out.println("Is empty? " + list.isEmpty());

        // 11. toArray()
        Object[] arr = list.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        // 13. sort (Java 8)
        list.sort(Comparator.naturalOrder());
        System.out.println("Sorted: " + list);

        // 14. removeIf (Java 8)
        list.removeIf(e -> e.equals("Java"));
        System.out.println("After removeIf: " + list);

        // 15. replaceAll (Java 8)
        list.replaceAll(String::toUpperCase);
        System.out.println("After replaceAll: " + list);

        // 16. clear()
        list.clear();
        System.out.println("After clear(): " + list);
        System.out.println("Is empty after clear? " + list.isEmpty());

        // 17. addAll()
        ArrayList<String> newList = new ArrayList<>();
        newList.add("C");
        newList.add("C++");
        newList.add("Python");
        list.addAll(newList);
        System.out.println("After addAll(): " + list);

        // 18. retainAll()
        ArrayList<String> retainList = new ArrayList<>();
        retainList.add("C++");
        list.retainAll(retainList);
        System.out.println("After retainAll(): " + list);

        // 19. removeAll()
        list.removeAll(retainList);
        System.out.println("After removeAll(): " + list);
        
      
        

       
    }
}
