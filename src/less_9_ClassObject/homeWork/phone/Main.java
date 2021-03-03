package less_9_ClassObject.homeWork.phone;

/**
 * TheSusanin
 * 03 март 2021
 */
public class Main {
    public static void main(String[] args) {
        // Экземпляр класса
        Phone apple = new Phone("147852369", "6S", 0.150);
        Phone samsung = new Phone("369852147", "7Note", 0.165);
        Phone xiaomi = new Phone("852369741", "8Note Pro", 0.165);

        System.out.println("Apple: " + apple.number + ", " + apple.model + ", " + apple.weight);
        System.out.println("Samsung: " + samsung.number + ", " + samsung.model + ", " + samsung.weight);
        System.out.println("Xiaomi: " + xiaomi.number + ", " + xiaomi.model + ", " + xiaomi.weight);

        apple.receiveCall("Атакем");
        samsung.receiveCall("Апакем");
        xiaomi.receiveCall("Брат", "0777 004-161");

        //apple.sendMessage(apple.number );

    }
}
