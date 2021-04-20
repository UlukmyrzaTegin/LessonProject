package less_15_ArrayList.homeWork;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * TheSusanin
 * 20 апрель 2021
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> bookList = new ArrayList<>();
        bookList.add(0,"Улуу тоого чыккан барбы?");
        bookList.add(1,"Бриллиант жылан");
        bookList.add(2,"Финансист");
        bookList.add(3,"Самурай без меча");
        bookList.add(4,"Кайдзен");

        System.out.println("---------------------");
        System.out.printf("ArrayList состоит из %d книг \n ", bookList.size());

        bookList.forEach(new Consumer<String>() {
            @Override
            public void accept(String books) {
               System.out.println(books);
            }
        });

        System.out.println("---------------------");
        System.out.println("Удален последняя книга");
        bookList.remove(4);

        System.out.println("---------------------");
        System.out.print("Проверка книг Кайдзен после удаление: " + bookList.contains("Кайдзен") + "\n");


        System.out.println("---------------------");
        System.out.println("Все книги после удаление: ");
        for (String books : bookList)
        System.out.println(books);

        System.out.println("----------------------");
        System.out.println("Книга для замены: " + bookList.get(3));
        bookList.set(3,"Чоочун киши");
        System.out.println("---------------------");

        System.out.println("Последняя книга: ");
        System.out.println(bookList.get(3));

        System.out.println("---------------------");
        System.out.println("Все книги после замены: ");
        for (String book : bookList)
            System.out.println(book);

        System.out.println("---------------------");
        System.out.println("Все книги очищены: ");
        bookList.clear();
        System.out.println("---------------------");

        System.out.println("Книги для прочтения: ");
        ArrayList<String> newBookList = new ArrayList<>();
        newBookList.add("Философия Java");
        newBookList.add("Spring in Action");
        newBookList.add("Clean Code");

        for (String newBook : newBookList)
            System.out.println(newBook);
    }
}
