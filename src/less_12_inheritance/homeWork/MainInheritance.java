package less_12_inheritance.homeWork;

/**
 * TheSusanin
 * 11 март 2021
 */
public class MainInheritance {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Азат", 25, 70000, "Middle", true, "admin", "123654");
        programmer.programmerInfo();
        System.out.println("---------------------------------");
        Driver driver = new Driver("Николай", 38, 30000, "Водитель");
        driver.driverCar();
        System.out.println("---------------------------------");
        CleaningLady cleaningLady = new CleaningLady("Айгул", 32, 30000, "Уборщица");
        cleaningLady.clear();
    }
}
