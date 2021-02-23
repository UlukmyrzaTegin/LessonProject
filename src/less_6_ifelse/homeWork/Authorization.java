package less_6_ifelse.homeWork;

import java.util.Scanner;

/**
 * TheSusanin
 * 15 февраль 2021
 */
public class Authorization {
    public static void main(String[] args) {
        String admin = "admin";
        String pasw = "1q2w";
        Scanner scanAuth = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = scanAuth.next();
        System.out.print("Введите пароль: ");
        String password = scanAuth.next();
        if (!admin.equals(login)) {
            System.out.println("Такого пользователь не существует!");
        } else if (!pasw.equals(password)) {
            System.out.println("Неверный пароль");
        } else
            System.out.println("Вход успешно выполнен");

     /*  Код, который Долон показывал на занятии
        String login, password;
       do {
            System.out.print("Введите логин: ");
             login = scanAuth.next();
            System.out.print("Введите пароль: ");
             password = scanAuth.next();
        } while (!(admin.equals(login) || password.equals(pasw)));
        */
      }
}
