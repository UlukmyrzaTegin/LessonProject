package less_15_ArrayList.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * TheSusanin
 * 4/21/2021
 */
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> iList = new LinkedList<>();
        iList.add("B");
        iList.add("C");
        iList.addFirst("G");
        iList.addLast("D");
        iList.add(3, "D");
        iList.add("E");
        iList.add("F");
        System.out.println("Linked list : " + iList);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("H");
        arrayList.add("I");
        iList.addAll(arrayList);
        System.out.println("Linked list after adding ArrayList contents: " + iList);

        iList.remove("B");
        iList.remove(3);
        iList.removeFirst();
        iList.removeLast();
        System.out.println("Linked list after deletion: " + iList);

        boolean value = iList.contains("G");
        if (value)
            System.out.println("List contains the element 'G' ");
        else
            System.out.println("List doesnt contain the element 'G' ");

        int size = iList.size();
        System.out.println("Size of linked list = " + size);

        Object element = iList.get(3);
        System.out.println("Element returned by get() : " + element);
        iList.set(3, "J");
        System.out.println("Linked list after change : " + iList);

        String[] lArray = iList.toArray(new String[iList.size()]);
        System.out.println("Array obtained from linked List: " + Arrays.toString(lArray));
    }
}
