package less_9_ClassObject.homeWork.phone;

/**
 * TheSusanin
 * 03 март 2021
 */
public class Main {
    public static void main(String[] args) {
        // Экземпляр класса
        Phone[] phones = new Phone[3];
        phones[0] = new Phone("8‑800‑333‑51‑73", "Apple iPhone 12", 155);
        phones[1] = new Phone("8-800-987-34-21", "Samsung 21S", 165);
        phones[2] = new Phone("8-800-775-66-15", "Xiaomi 11Note Pro", 148);

        System.out.println(phones[0].number + ", " + phones[0].model + ", " + phones[0].weight);
        System.out.println(phones[1].number + ", " + phones[1].model + ", " + phones[1].weight);
        System.out.println(phones[2].number + ", " + phones[2].model + ", " + phones[2].weight);
        System.out.println("------------------------------------------");
        phones[0].receiveCall("Сосед");
        phones[2].receiveCall("8-800-775-66-15");
        phones[1].sendMessage("Message", "8-800-987-34-21 ", "8-800-775-66-15");
    }
}
