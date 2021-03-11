package less_12_inheritance.classWork.models;

/**
 * TheSusanin
 * 3/5/2021 Mar 2021
 */
public class Car {
    private String name;
    private String model;
    private String door;
    private String engine;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public Car(String name, String model, String door,String engine) {
        this.name = name;
        this.model = model;
        this.door = door;
        this.engine = engine;
    }

    public void drive() {
        System.out.println(getName() + " - заводи!");

    }
    public void reverse() {
        System.out.println(getName() + " - Назад");

    }
    public void stop() {
        System.out.println(getName() + " - Тормози, впреди светафор!");
    }

    public void noHorse() {

        System.out.println(getName() + " - Но, чу!");
    }

}
