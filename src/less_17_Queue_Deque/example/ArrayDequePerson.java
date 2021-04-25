package less_17_Queue_Deque.example;

import java.util.ArrayDeque;

/**
 * TheSusanin
 * 4/24/2021
 */
public class ArrayDequePerson {
    public static void main(String[] args) {
        ArrayDeque<String> states = new ArrayDeque<String>();

        states.add("Germany");
        states.addFirst("France");
        states.push("Great Britian");
        states.addLast("Spain");
        states.add("Italy");

        //Получаем первый элемент без удаления
        System.out.println(states.getFirst());
        System.out.println("------------");
        System.out.println(states.getLast());
        System.out.println("------------");
        System.out.printf("Queue size: %d \n ", states.size());

        //перебор коллекции
        while (states.peek() != null) {
            //извлечение с начала
            System.out.println(states.pop());
        }

        //о


    }
}
