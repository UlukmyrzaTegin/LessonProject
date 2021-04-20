package less_15_ArrayList.homeWork.LinkedList;

import java.util.LinkedList;
import java.util.function.Consumer;

/**
 * TheSusanin
 * 20 апрель 2021
 */
public class LinkedMain {
    public static void main(String[] args) {
        LinkedList<String> booksLinked = new LinkedList<>();
        booksLinked.addFirst("Философия Java");
        booksLinked.addFirst("Философия Java");
        booksLinked.addLast("Spring в действии");
        booksLinked.addLast("Spring в действии");

        for (int i = 0; i < booksLinked.size() ; i++) {
            String values = booksLinked.get(i);
            booksLinked.removeFirst();
            booksLinked.removeLast();
            System.out.println("------------------------------");
            System.out.println(values);
        }

        booksLinked.forEach(new Consumer<String>() {
            @Override
            public void accept(String books) {
                System.out.println(books);
            }
        });
    }
}
