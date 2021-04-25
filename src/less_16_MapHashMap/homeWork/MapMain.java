package less_16_MapHashMap.homeWork;

import java.util.*;

/**
 * TheSusanin
 * 4/21/2021
 */
public class MapMain {

    public static void main(String[] args) {
       // LoginAndPassword loginAndPassword = new LoginAndPassword();
        int attemp = 1;
        Map<String, User> userMap = new HashMap<>();
        User user = new User(1L, "123321", true, null, 0);
        User user1 = new User(2L, "456654", true, null, 0);
        userMap.put("login", user);
        userMap.put("admin", user1);
        String userId = String.valueOf(user);
        String password = String.valueOf(user);

        Scanner login = new Scanner(System.in);
        System.out.println("Введите имя пользователя");
        userId = login.nextLine();
        System.out.println("Введите пароль");
        password = login.nextLine();

        if (user.equals(userId) && password.equals(password)) {
            System.out.println("Успешно");
        } else
            if(user.equals(userId) &&(!(password.equals(password))) && attemp ==3) {
                System.out.println("Доступ запрещен! \n Максимальное количество попыток");
                System.exit(0);
            } else {
                System.out.println("Доступ запрещен! \n Попытка:" + attemp + "/ 3");
                attemp ++;

            }
//        if (loginAndPassword.equals(login) || (loginAndPassword.equals(login))) {
//            System.out.println("Welcome");
//        } else {
//            System.out.println("Error");
//        }

//        Scanner input = new Scanner(System.in);
//        String user, password;
//        System.out.println("Введите имя пользователя");
//        user = input.nextLine();
//
//        System.out.println("Введите пароль");
//        password = input.nextLine();
//
//        if (user.equals("admin") && (password.equals("123321"))) {
//            System.out.println("Успешно");
//        } else {
//            System.out.println("Ошибка");
//        }
    }
}
