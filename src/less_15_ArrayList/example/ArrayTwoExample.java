package less_15_ArrayList.example;

import java.util.ArrayList;

/**
 * TheSusanin
 * 4/21/2021
 */
public class ArrayTwoExample {
    public static void main(String[] args) {
//        String[] deliveryCities = {"Chicago", "New-York", "Toronto", "Paris"};
//        String[] deliveryCities2 = new String[deliveryCities.length + 1];
//        for (int i = 0; i < deliveryCities.length ; i++) {
//            deliveryCities2[i] = deliveryCities[i];
//        }
//        deliveryCities2[deliveryCities.length] = "London";
//        System.out.println(deliveryCities + " " + deliveryCities2);

        ArrayList<String> deliveryCities = new ArrayList<>();
        deliveryCities.add("Chicago");
        deliveryCities.add("New-York");
        deliveryCities.add("Toronto");
        deliveryCities.add("Paris");

        // получаем длинну массива в ArrayList
        System.out.println(deliveryCities.size());
        deliveryCities.forEach(System.out :: println);

        // Добавляем элемент в середину списка по индексу
        System.out.println("----------------------------------------------");
        System.out.println("Добавляем элемент в середину списка по индексу: Index 1 ");
        deliveryCities.add(1, "Washington");
        deliveryCities.forEach(System.out :: println);

        //
        System.out.println("----------------------------------------------");
        System.out.println("Получаем элемент под определенным индексом, Exm index 2 ");
        System.out.println(deliveryCities.get(2));

        //
        System.out.println("----------------------------------------------");
        System.out.println("Узнаем индекс определенного элемента, indexOf:");
        System.out.println(deliveryCities.indexOf("Washington"));
        System.out.println(deliveryCities.indexOf("Bishkek"));

        //
        System.out.println("----------------------------------------------");
        System.out.println("Узнаем есть ли такой элемент в списке с методом contains: ");
        System.out.println("Такой элемент есть: " + deliveryCities.contains("Toronto"));
        System.out.println("Такой элемент есть: " + deliveryCities.contains("Talas"));

        //
        System.out.println("----------------------------------------------");
        System.out.println("Замена один элемент на другой:");
        deliveryCities.set(3, "Talas");
        System.out.println("3 индекс заменен на " + deliveryCities.get(3));

        System.out.println("----------------------------------------------");
        System.out.println("Все города после замена: ");
        deliveryCities.forEach(System.out :: println);

        System.out.println("----------------------------------------------");
        System.out.println("Удаление элемента из ArrayLst по индексу и по элементу");
        deliveryCities.remove(0);
        deliveryCities.remove("New-York");

        System.out.println("----------------------------------------------");
        System.out.println("Все города после удаления: ");
        deliveryCities.forEach(System.out :: println);
    }
}
