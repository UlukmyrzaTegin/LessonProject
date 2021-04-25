package less_16_MapHashMap.example;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * TheSusanin
 * 4/22/2021
 */
public class MapBook {
    public static void main(String[] args) {
        HashMap<Integer, String> booksMap = new HashMap<>();
        booksMap.put(2000, "Angels and Demon");
        booksMap.put(2003, "The Da Vinci Code");
        booksMap.put(2009, "The Lost Symbol");
        booksMap.put(2013, "Inferno");
        booksMap.putIfAbsent(2017, "Origin"); // - добавляет не существующий код и значения

        Set<Map.Entry<Integer, String>> entrySet = booksMap.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) { // проходить по всем массивам
            System.out.println(entry.getKey());  // getKey - получить по ключу
            System.out.println(entry.getValue()); // getValue - получить по значению
            //entry.setValue("Not Found"); // setValue - заменит значение
        }
        System.out.println("----------------------------------------");
        System.out.println(booksMap.values());
        System.out.println(booksMap.keySet());

        System.out.println("-----------------------------------------");
        System.out.println(booksMap.size());

        System.out.println("-----------------------------------------");
        System.out.println(booksMap.remove(2000));
        System.out.println(booksMap.remove(2001, "Adep"));

        System.out.println("-----------------------------------------");
        System.out.println(booksMap.containsKey(2002));  // поиск по ключу, если есть то вернет true, иначе false
        System.out.println(booksMap.containsValue("Apple")); //поиск по значению, если есть то вернет true, иначе false
        System.out.println("-----------------------------------------");
        System.out.println(booksMap.containsKey(2000)); //поиск по ключу, если есть то вернет true, иначе false
        System.out.println(booksMap.containsValue("Origin")); //поиск по значению, если есть то вернет true, иначе false

        booksMap.forEach((k, v) -> System.out.println(k + " - " + v)); // два значения, лямбда выражения
        //System.out.println(booksMap);
    }
}
