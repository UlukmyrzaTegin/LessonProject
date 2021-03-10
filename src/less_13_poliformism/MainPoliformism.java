package less_13_poliformism;

import less_13_poliformism.models.Analyst;
import less_13_poliformism.models.Programmer;

/**
 * TheSusanin
 * 3/10/2021 Mar 2021
 */
public class MainPoliformism {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Aidai", 10000, "Java");
        programmer.work();
        programmer.spendMoney();

    }
}
