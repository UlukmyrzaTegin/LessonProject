package less_9_ClassObject.homeWork.phone;

import java.sql.SQLOutput;

/**
 * TheSusanin
 * 03 март 2021
 */
public class Phone {
     String number;
     String model;
     double weight;

    public Phone() { // конструктор без параметоров
    }

    public Phone(String number, String model) { // конструктор с двумя параметрами
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) { // конструктор с тремя параметрами
        this(number, model);  //вызов конструктора с двумя параметрами
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }
    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + ". " + number);
    }

    public void sendMessage(String message, String ...numbers) {
        System.out.println("Отравка сообщения " + message + " на телефоны: ");
        for (String num : numbers) {
            System.out.println(num);
        }
    }
 }
