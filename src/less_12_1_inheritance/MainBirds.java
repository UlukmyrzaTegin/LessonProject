package less_12_1_inheritance;

import less_12_1_inheritance.models.Crow;
import less_12_1_inheritance.models.Ostrich;

/**
 * TheSusanin
 * 3/14/2021
 */
public class MainBirds {
    public static void main(String[] args) {
        Ostrich ostrich = new Ostrich("Ostrich");
        Crow crow = new Crow("Crow");
        ostrich.walk();
        crow.fly();
        System.out.println(ostrich + " " + crow);
    }
}
