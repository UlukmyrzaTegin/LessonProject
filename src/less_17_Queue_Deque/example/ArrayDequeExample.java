package less_17_Queue_Deque.example;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayDeque;
import java.util.jar.JarOutputStream;

/**
 * TheSusanin
 * 4/24/2021
 */
public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        numbers.addFirst(1);
        numbers.addLast(2);
        numbers.add(3);
        numbers.offer(4);
        numbers.forEach(System.out :: println);

        System.out.println("-------------------");
        System.out.println("Первое вхождение: ");
        System.out.println(numbers.peek());

        System.out.println("-------------------");
        System.out.println("Удален первое вхождение: ");
        numbers.remove();

        System.out.println("--------------------");
        System.out.println("После удаления первого вхождения, стал первым элементом: ");
        System.out.println(numbers.getFirst());

        System.out.println("---------------------");
        System.out.println("Все вхожденные элементы: ");
        numbers.forEach(System.out :: println);

        System.out.println("-------------------");
        System.out.println(numbers.peek());
        System.out.println(numbers.peekFirst());
        System.out.println(numbers.peekLast());

        System.out.println("-------------------");
        System.out.println(numbers.element());
        numbers.element();

        System.out.println("-------------------");
        System.out.println("Добавление элемента в самое начало очереди");
        System.out.println(numbers.offerFirst(5));
        System.out.println("-------------------");
        System.out.println("Добавление элемента в конец очереди");
        System.out.println(numbers.offerLast(6));

        System.out.println("---------------------");
        System.out.println("Все вхожденные элементы: ");
        numbers.forEach(System.out :: println);

        System.out.println("---------------------");
        System.out.println("Удален последее вхождения");
        System.out.println(numbers.removeLast());
        System.out.println("---------------------");
        System.out.println("После удаления последнего вхождения, стал последним элементом: ");
        System.out.println(numbers.pollLast());


    }

}
