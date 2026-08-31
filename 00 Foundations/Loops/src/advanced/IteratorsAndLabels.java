

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorsAndLabels {
    public static void main(String[] args) {
        System.out.println("--- LABELED BREAK: Exiting Outer Loop ---");

        outerLoop:
        for (int i =0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Breaking out of BOTH loops at i=" + i + ", j=" + j);
                    break outerLoop;
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }

        System.out.println("\n--- ITERATOR: Remove elements safely ---");
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Carrot");
        items.add("Donut");

        System.out.println("Before removal: " + items);

        Iterator<String> iterator = items.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if ("Banana".equals(item)) {
                iterator.remove();
            }
        }
        System.out.println("After removal: " + items);

        System.out.println("\n--- DANGER ZONE: Concurrent Modification ---");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        /* 
        for (Integer  num: numbers){
            if (num == 2) {
                numbers.remove(num);
            }
        }
         */
        System.out.println("The code above is commented out to prevent a crash!");
        System.out.println("Never remove items from a list while iterating with for-each");

        System.out.println("\n--- SAFE BACKWARDS REMOVAL ---");
        for (int i = numbers.size() - 1; i >= 0; i --) {
            if (numbers.get(i) == 2) {
                numbers.remove(i);
            }
        }
        System.out.println("Safe removal result: " + numbers);
    }

}
