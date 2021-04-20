package less_15_ArrayList.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * TheSusanin
 * 20 апрель 2021
 */
public class ArrayFirstExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayListLarge = new ArrayList<>(100000);
        LinkedList<String> linkedList = new LinkedList<>();
        arrayList.add("Johhny");
        arrayList.add("Watson");
        linkedList.add("Java");
        linkedList.addFirst("I think");
        linkedList.addLast("Language");
        linkedList.add(3, "is a terrific");

        //получение размер списков
        int arraySize = arrayList.size();
        int linkedSize = linkedList.size();

        System.out.println(arraySize);
        System.out.println(linkedSize);
        System.out.println("--------------------");
        for (int i = 0; i < arrayList.size() ; i++) {
            String value = arrayList.get(i);
            System.out.println(value);
        }
        System.out.println("-------------------");
        for (int i = 0; i <  linkedList.size(); i++) {
            String value = linkedList.get(i);
            String remove = linkedList.removeFirst();
            System.out.println(value);
            System.out.println(remove);

        }
        System.out.println("-------------------");
        for (String s : arrayList) {
            System.out.println(s);
        }
        System.out.println("-------------------");
        for (String s : linkedList) {
            System.out.println(s);
        }
        System.out.println("-------------------");
        ListIterator<String> iterator = arrayList.listIterator();
        while (iterator.hasNext()) {
            String next = (String) iterator.next();
            if (next.equals("Johhny")) {
                iterator.set("Jack");
            }
        }
        System.out.println(arrayList);

        Iterator<String> removeIterator = arrayList.iterator();
        while (removeIterator.hasNext()) {
            String remove = (String) removeIterator.next();
            if (remove.equals("Language")) {
                removeIterator.remove();
            }
        }
        System.out.println("Удален запись " + arrayList);
    }

}
