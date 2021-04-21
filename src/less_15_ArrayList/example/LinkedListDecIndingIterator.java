package less_15_ArrayList.example;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * TheSusanin
 * 4/22/2021
 */
public class LinkedListDecIndingIterator {
    public static void main(String[] args) {
        LinkedList<String> iList = new LinkedList<>();
        iList.add("Pune");
        iList.add("Mumbai");
        iList.add("Nagpur");
        System.out.println("Linked list : " + iList);
        System.out.println("Linked list in reverse order:");

        Iterator iterator = iList.descendingIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
