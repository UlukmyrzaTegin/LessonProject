package less_10_method.Deposit;

/**
 * TheSusanin
 * 01 март 2021
 */
public class Account {
    int acc_no;
    String name;
    float amount;
    //метод инициализация обьекта
    void insert (int a, String n, float amt) {
        acc_no = a;
        name = n;
        amount = amt;
    }
    //метод депозита
    void deposit(float amt) {
        amount += amt;
        System.out.println(amt + "депозитирован");
    }
    // метод вывода
    void withdraw(float amt) {
        if (amount < amt) {
            System.out.println("Недостаточный баланс");
        } else {
            amount -= amt;
            System.out.println("Отозван");
        }
    }
    //метод для проверки баланса счета
    void checkBalance() {
        System.out.println("Баланс равен: "+ amount);
    }
    // метод для отображения значений обьекта
    void display() {
        System.out.println(acc_no + " " + name + " " + amount);
    }
}
