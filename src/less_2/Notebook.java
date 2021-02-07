package less_2;

/**
 * TheSusanin
 * Fri Feb 2021
 */
public class Notebook {
    public static void main(String[] args) {

        String systemManufacturer = "Lenovo";
        String model = "E520";
        short hardDisk = 300;
        short memory = 8192;
        String processor = "i3-2330MB";
        char ghz = 126;
        String core = "4CPUs";
        String ghzName = "2.2GHz";

        System.out.println("Мой ноутбук " + systemManufacturer);
        System.out.println("Модель моего ноутбука " + model);
        System.out.println("Обьем джесткого диска составляет " + hardDisk + "Гб");
        System.out.println("ОЗУ " + memory + "MB");
        System.out.println("Процессор моего ноутбука " + processor + " ядро "+ core + " и частота " + ghz + ghzName);

    }

}
