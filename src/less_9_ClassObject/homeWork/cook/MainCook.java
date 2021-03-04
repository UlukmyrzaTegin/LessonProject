package less_9_ClassObject.homeWork.cook;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * TheSusanin
 * 04 март 2021
 */
public class MainCook {
    public static void main(String[] args) {
        Cook cook = new Cook("Жаныбек", 32);
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите блюда: 1.Глазунья 2.Омлет");
        cook.cookMethod(scan.next());
    }
}
